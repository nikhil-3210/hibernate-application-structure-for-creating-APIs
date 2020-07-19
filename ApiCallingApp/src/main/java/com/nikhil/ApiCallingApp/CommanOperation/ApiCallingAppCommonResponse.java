package com.nikhil.ApiCallingApp.CommanOperation;

public class ApiCallingAppCommonResponse {
	private int cIntResponseStatus = ApiCallingAppResponseCode.SERVERERROR;
	private Object cObjResponseData = null;
	private String cStrMessage = null;	
	
	
	public int getResponseStatus() {
		return cIntResponseStatus;
	}

	public void setResponseStatus(int pIntResponseStatus) {
		this.cIntResponseStatus = pIntResponseStatus;
	}

	public Object getResponseData() {
		return cObjResponseData;
	}

	public void setResponseData(Object cObjResponseData) {
		this.cObjResponseData = cObjResponseData;
	}

	public String getMessage() {
		return cStrMessage;
	}

	public void setMessage(String cStrMessage) {
		this.cStrMessage = cStrMessage;
	}

	
	public void setResponse(int pIntResponseStatus, String pStrMessage){
		setResponse(pIntResponseStatus, null, pStrMessage);
	}
	
	public void setResponse(int pIntResponseStatus, Object pObjResponseData){
		setResponse(pIntResponseStatus, pObjResponseData, null);
		
	}
	
	public void setResponse(int pIntResponseStatus, Object pObjResponseData, String pStrMessage){
		setResponseStatus(pIntResponseStatus);
		setResponseData(pObjResponseData);
		setMessage(pStrMessage);
	}
	
	
}
