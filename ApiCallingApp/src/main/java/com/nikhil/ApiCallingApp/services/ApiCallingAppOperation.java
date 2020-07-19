package com.nikhil.ApiCallingApp.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nikhil.ApiCallingApp.helper.ApiCallingAppHelper;

@Path("ApiCallingApp")
public class ApiCallingAppOperation {

	static final Logger LOG = LoggerFactory.getLogger(ApiCallingAppOperation.class);
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "hello world";
	}
	
	@GET
	@Path("/getStudentsList")
	@Produces(MediaType.TEXT_PLAIN)
	public String getStudentsList() {
		
		String lStrGsonResult = null;
		ApiCallingAppHelper lObjApiCallingAppHelper = null;
		try {
	
			lObjApiCallingAppHelper = new ApiCallingAppHelper();
			lStrGsonResult = lObjApiCallingAppHelper.doGetStudentsList();

		} catch (Exception e) {
			LOG.info("InputParameters : \nException : {}", e.toString());

		}finally {
			
		}
		return lStrGsonResult;
	}
}