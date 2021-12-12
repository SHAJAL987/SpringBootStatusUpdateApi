package com.service.request.api.service;

import java.util.List;

import com.service.request.api.model.ServiceRequestMst;

public interface ServiceRequestMstService {
	
	//Get All Data From ServiceRequest Table
	List<ServiceRequestMst> getAllServices();

	//Find Data Using Tracker Id
	Integer findByTrackerId(Long tracker_id);
	
	//Update Service
	Integer updateService(String issue_flag, Long tracker_id) ;
		
	
}
