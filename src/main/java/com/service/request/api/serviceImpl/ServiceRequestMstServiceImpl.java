package com.service.request.api.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.service.request.api.model.ServiceRequestMst;
import com.service.request.api.repository.ServiceRequestMstRepository;
import com.service.request.api.service.ServiceRequestMstService;

@Service
public class ServiceRequestMstServiceImpl implements ServiceRequestMstService {

	private ServiceRequestMstRepository serviceRequestMstRepository;

	public ServiceRequestMstServiceImpl(ServiceRequestMstRepository serviceRequestMstRepository) {
		super();
		this.serviceRequestMstRepository = serviceRequestMstRepository;
	}

	//Get All Data From ServiceRequestMst
	@Override
	public List<ServiceRequestMst> getAllServices() {
		return serviceRequestMstRepository.findAll();
	}

	//Get Data Using TrackerId
	@Override
	public Integer findByTrackerId(Long tracker_id) {
		return serviceRequestMstRepository.findByTrackerId(tracker_id);
	}

	//Update Service
	@Override
	public Integer updateService(String issue_flag, Long tracker_id) {
		return serviceRequestMstRepository.updateService(issue_flag, tracker_id);
	}

}
