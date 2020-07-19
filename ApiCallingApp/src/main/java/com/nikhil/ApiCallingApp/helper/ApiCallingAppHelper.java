package com.nikhil.ApiCallingApp.helper;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.GenericJDBCException;
import org.hibernate.exception.JDBCConnectionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nikhil.ApiCallingApp.BusinessEntity.Student_infoBE;
import com.nikhil.ApiCallingApp.CommanOperation.ApiCallingAppCommonOperations;
import com.nikhil.ApiCallingApp.CommanOperation.ApiCallingAppCommonResponse;
import com.nikhil.ApiCallingApp.CommanOperation.ApiCallingAppResponseCode;
import com.nikhil.ApiCallingApp.addons.AnnotationExclusionStrategy;
import com.nikhil.ApiCallingApp.utils.PojoToBEConverter;
import com.nikhil.ApiCallingAppHBM.hbm.pojo.Student_info;
import com.nikhil.ApiCallingAppHBM.hbm.util.ApiCallingAppHBMUtil;

public class ApiCallingAppHelper {

	static final Logger LOG = LoggerFactory.getLogger(ApiCallingAppHelper.class);
	
	public String doGetStudentsList() {
		ApiCallingAppResponseCode lObjApiCallingAppResponseCode = null;
		ApiCallingAppHBMUtil lObjApiCallingAppHBMUtil = null;
		Session lObjSession = null;
		Transaction lObjTransaction = null;
		PojoToBEConverter lObjPojoToBEConverter = null;
		ArrayList<Student_infoBE> lLstStudent_infoBE = null;
		String lStrGsonResult = null;
		ApiCallingAppCommonResponse lObjApiCallingAppCommonResponse = null;
		ApiCallingAppCommonOperations lObjApiCallingAppCommonOperations = null;
		
		try {
			lObjApiCallingAppResponseCode = new ApiCallingAppResponseCode();
			lObjApiCallingAppHBMUtil = new ApiCallingAppHBMUtil();
			lObjSession = lObjApiCallingAppHBMUtil.getHbmSession();
			lObjTransaction = lObjSession.beginTransaction();
			lObjApiCallingAppCommonResponse = new ApiCallingAppCommonResponse();
			lObjApiCallingAppCommonOperations = new ApiCallingAppCommonOperations();
			
			
			String hqlString = "FROM Student_info";
			Query query = lObjSession.createQuery(hqlString);
			List<Student_info> results = (List<Student_info>) query.list();

			if (!results.isEmpty()) {
				lObjPojoToBEConverter = new PojoToBEConverter();
				lLstStudent_infoBE = new ArrayList<Student_infoBE>();
				
				for(Student_info lObjStudent_info1 : results) {
					lLstStudent_infoBE.add(lObjPojoToBEConverter
							.convertStudent_infoToStudent_infoBE(lObjStudent_info1));
				}
				
				if (lLstStudent_infoBE != null) {
					lObjApiCallingAppCommonResponse.setResponse(lObjApiCallingAppResponseCode.GET_SUCCESS,
							lLstStudent_infoBE);
				}

			} else {
				lObjApiCallingAppCommonResponse.setResponse(lObjApiCallingAppResponseCode.NOCONTENT,
						"No matching transaction found.");
			}
			
			// convert response into Gson string
				lStrGsonResult = lObjApiCallingAppCommonOperations.setResult(lObjApiCallingAppCommonResponse,
																		new AnnotationExclusionStrategy());
		} catch (JDBCConnectionException | GenericJDBCException ex) {

			if (lObjTransaction != null) {
				lObjTransaction.rollback();
			}
			LOG.info(ex.toString());

		} catch (Exception ex) {

			if (lObjTransaction != null) {
				lObjTransaction.rollback();
			}
			LOG.info(ex.toString());
		}
		
		return lStrGsonResult;
	}
}
