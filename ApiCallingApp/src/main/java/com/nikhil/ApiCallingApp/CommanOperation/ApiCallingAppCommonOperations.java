package com.nikhil.ApiCallingApp.CommanOperation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ApiCallingAppCommonOperations {
	static final Logger LOG = LoggerFactory.getLogger(ApiCallingAppCommonOperations.class);
	/* #UTF-8 Decoding */
	
	public String setResult(ApiCallingAppCommonResponse pObjCogFrameworkCommonResponse, ExclusionStrategy pObjExclusionStrategy){
		GsonBuilder lObjGsonBuilder = null;
		Gson lObjGson = null;
		String lStrGsonResult = null;
		try {
			lObjGsonBuilder = new GsonBuilder();
			lObjGsonBuilder.setExclusionStrategies(pObjExclusionStrategy);
			lObjGson = lObjGsonBuilder.create();
			lStrGsonResult = lObjGson.toJson(pObjCogFrameworkCommonResponse);
		} catch (Exception e){
			LOG.info("Exception : {}", e.toString());
			throw e;
		} finally {
			lObjGsonBuilder = null;
			lObjGson = null;
		}
		return lStrGsonResult;
	}
	
	
	public String setResult(ApiCallingAppCommonResponse pObjCogFrameworkCommonResponse){
		GsonBuilder lObjGsonBuilder = null;
		Gson lObjGson = null;
		String lStrGsonResult = null;
		try {
			lObjGsonBuilder = new GsonBuilder();
			lObjGson = lObjGsonBuilder.create();
			lStrGsonResult = lObjGson.toJson(pObjCogFrameworkCommonResponse);
		} catch (Exception e){
			LOG.info("Exception : {}", e.toString());
			throw e;
		} finally {
			lObjGsonBuilder = null;
			lObjGson = null;
		}
		return lStrGsonResult;
	}
}
