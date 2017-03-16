package com.ss.api.model;

import java.util.List;

public class ResponseModel {
	// required parameters

	// optional parameters
	String responseType; // success,fail,exception 
	String responseMessage;
	List<UserDetailsModel> userDetailsList;
	List<WelcomeAppModel> welcomeAppList;
	
	
	
	
	public ResponseModel(ResponseModelBuilder builder) {
	    this.responseType= builder.responseType;
	    this.responseMessage=builder.responseMessage;
	    
	}




	public static class ResponseModelBuilder{
		// required parameters

		// optional parameters
		String responseType; // success,fail,exception 
		String responseMessage;
		List<UserDetailsModel> userDetailsList;
		List<WelcomeAppModel> welcomeAppList;
		public ResponseModelBuilder setResponseType(String resType){
			this.responseType=resType;
			return this;
		}
		public ResponseModelBuilder setResponseMessage(String resMessage){
			this.responseMessage=resMessage;
			return this;
		}		
		public ResponseModelBuilder setUserDetailsModel(List<UserDetailsModel> list){
			this.userDetailsList=list;
			return this;
		}
		public ResponseModelBuilder setWelcomeAppModel(List<WelcomeAppModel> list){
			this.welcomeAppList=list;
			return this;
		}		
		
		public ResponseModel build(){
			return new ResponseModel(this);
		}
	}
}
