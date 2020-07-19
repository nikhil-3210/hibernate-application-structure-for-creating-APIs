package com.nikhil.ApiCallingApp.utils;

import com.nikhil.ApiCallingApp.BusinessEntity.Student_infoBE;
import com.nikhil.ApiCallingAppHBM.hbm.pojo.Student_info;

public class PojoToBEConverter {

	public Student_infoBE convertStudent_infoToStudent_infoBE(Student_info lObjStudent_info) 
			throws Exception {
		Student_infoBE lObjStudent_infoBE;
		
		try {
			lObjStudent_infoBE = new Student_infoBE();
			lObjStudent_infoBE.setRoll_No(lObjStudent_info.getRoll_No());
			lObjStudent_infoBE.setStudent_Name(lObjStudent_info.getStudent_Name());
			lObjStudent_infoBE.setStudent_Surname(lObjStudent_info.getStudent_Surname());
			lObjStudent_infoBE.setStudent_MobileNo(lObjStudent_info.getStudent_MobileNo());
			
		} catch (Exception e) {
			lObjStudent_infoBE = null;
			throw e;
		}finally {
			
		}
		
		return lObjStudent_infoBE;
	}
}
