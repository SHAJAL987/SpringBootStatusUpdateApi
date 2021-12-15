package com.service.request.api.model;

public class Parameters {
	
	private String tracker_id;
	private String ac_no;
	private String issue_flag;
	private String errorFlag;
	private String errorMessage;
	
	public String getTracker_id() {
		return tracker_id;
	}
	public void setTracker_id(String tracker_id) {
		this.tracker_id = tracker_id;
	}
	public String getAc_no() {
		return ac_no;
	}
	public void setAc_no(String ac_no) {
		this.ac_no = ac_no;
	}
	public String getIssue_flag() {
		return issue_flag;
	}
	public void setIssue_flag(String issue_flag) {
		this.issue_flag = issue_flag;
	}
	public String getErrorFlag() {
		return errorFlag;
	}
	public void setErrorFlag(String errorFlag) {
		this.errorFlag = errorFlag;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public Parameters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parameters(String tracker_id, String ac_no, String issue_flag, String errorFlag, String errorMessage) {
		super();
		this.tracker_id = tracker_id;
		this.ac_no = ac_no;
		this.issue_flag = issue_flag;
		this.errorFlag = errorFlag;
		this.errorMessage = errorMessage;
	}

}
