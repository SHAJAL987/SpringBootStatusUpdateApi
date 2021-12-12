package com.service.request.api.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MB_SERVICE_MST")
public class ServiceRequestMst {

	@Id
	private long service_id;

	@Column(name = "CUST_NO", nullable = false)
	private int cust_no;

	@Column(name = "SERVICE_TYPE_ID", nullable = false)
	private int service_type_id;

	@Column(name = "OLD_DOCMENT_NO", nullable = false)
	private String old_document_no;

	@Column(name = "ISSUE_DATE", nullable = true)
	private Date issue_date;

	@Column(name = "CREATE_BY", nullable = false)
	private String create_by;

	@Column(name = "CREATE_DATE", nullable = false)
	private Date create_date;

	@Column(name = "UPDATE_BY", nullable = true)
	private String update_by;

	@Column(name = "UPDATE_DATE", nullable = true)
	private Date update_date;

	@Column(name = "ISSUE_FLAG", nullable = true)
	private String issue_flag;

	@Column(name = "REMARKS", nullable = true)
	private String remarks;

	@Column(name = "OUTLET_ID", nullable = true)
	private int outlet_id;

	@Column(name = "SOL_ID", nullable = true)
	private String sol_id;

	@Column(name = "NEW_DOCMENT_NO", nullable = true)
	private String new_document_no;

	@Column(name = "AC_NO", nullable = true)
	private String ac_no;

	@Column(name = "DOC_IMG", nullable = true)
	private Blob doc_img;

	@Column(name = "DEVICE", nullable = true)
	private String device;

	@Column(name = "AC_TITLE", nullable = true)
	private String ac_title;

	@Column(name = "DOC_IMAGE_FILE_NAME", nullable = true)
	private String doc_image_file_name;
	
	@Column(name="TRACKER_ID", nullable = false)
	private long tracker_id;
	
	

	public ServiceRequestMst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ServiceRequestMst(long service_id, int cust_no, int service_type_id, String old_document_no, Date issue_date,
			String create_by, Date create_date, String update_by, Date update_date, String issue_flag, String remarks,
			int outlet_id, String sol_id, String new_document_no, String ac_no, Blob doc_img, String device,
			String ac_title, String doc_image_file_name, long tracker_id) {
		super();
		this.service_id = service_id;
		this.cust_no = cust_no;
		this.service_type_id = service_type_id;
		this.old_document_no = old_document_no;
		this.issue_date = issue_date;
		this.create_by = create_by;
		this.create_date = create_date;
		this.update_by = update_by;
		this.update_date = update_date;
		this.issue_flag = issue_flag;
		this.remarks = remarks;
		this.outlet_id = outlet_id;
		this.sol_id = sol_id;
		this.new_document_no = new_document_no;
		this.ac_no = ac_no;
		this.doc_img = doc_img;
		this.device = device;
		this.ac_title = ac_title;
		this.doc_image_file_name = doc_image_file_name;
		this.tracker_id = tracker_id;
	}



	public long getService_id() {
		return service_id;
	}

	public void setService_id(long service_id) {
		this.service_id = service_id;
	}

	public int getCust_no() {
		return cust_no;
	}

	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}

	public int getService_type_id() {
		return service_type_id;
	}

	public void setService_type_id(int service_type_id) {
		this.service_type_id = service_type_id;
	}

	public String getOld_document_no() {
		return old_document_no;
	}

	public void setOld_document_no(String old_document_no) {
		this.old_document_no = old_document_no;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public String getIssue_flag() {
		return issue_flag;
	}

	public void setIssue_flag(String issue_flag) {
		this.issue_flag = issue_flag;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getOutlet_id() {
		return outlet_id;
	}

	public void setOutlet_id(int outlet_id) {
		this.outlet_id = outlet_id;
	}

	public String getSol_id() {
		return sol_id;
	}

	public void setSol_id(String sol_id) {
		this.sol_id = sol_id;
	}

	public String getNew_document_no() {
		return new_document_no;
	}

	public void setNew_document_no(String new_document_no) {
		this.new_document_no = new_document_no;
	}

	public String getAc_no() {
		return ac_no;
	}

	public void setAc_no(String ac_no) {
		this.ac_no = ac_no;
	}

	public Blob getDoc_img() {
		return doc_img;
	}

	public void setDoc_img(Blob doc_img) {
		this.doc_img = doc_img;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getAc_title() {
		return ac_title;
	}

	public void setAc_title(String ac_title) {
		this.ac_title = ac_title;
	}

	public String getDoc_image_file_name() {
		return doc_image_file_name;
	}

	public void setDoc_image_file_name(String doc_image_file_name) {
		this.doc_image_file_name = doc_image_file_name;
	}

	public long getTracker_id() {
		return tracker_id;
	}


	public void setTracker_id(long tracker_id) {
		this.tracker_id = tracker_id;
	}


	
	
	
	
	
	

}
