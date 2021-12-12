package com.service.request.api.repository;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.service.request.api.model.ServiceRequestMst;

public interface ServiceRequestMstRepository extends JpaRepository<ServiceRequestMst, Long>{
	
	@Query("select count(u) from ServiceRequestMst u where u.tracker_id = :tracker_id")
	Integer findByTrackerId(Long tracker_id);
	
	@Modifying
	@Transactional
	@Query("update ServiceRequestMst set issue_flag = :issue_flag where tracker_id = :tracker_id")
	Integer updateService(String issue_flag, Long tracker_id) ;
	
	


}
