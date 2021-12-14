package com.service.request.api.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.service.request.api.model.ServiceRequestMst;
import com.service.request.api.service.ServiceRequestMstService;


@RestController
@RequestMapping("/api/service")
public class ServiceController {

	private ServiceRequestMstService serviceRequestMstService;
	

	

	public ServiceController(ServiceRequestMstService serviceRequestMstService) {
		super();
		this.serviceRequestMstService = serviceRequestMstService;
	}
	

	/* URL: http://localhost:8787/api/service/
	 * END POINT: /
	 * REQUEST: GET
	 */
	@GetMapping(value="/")
	public List<ServiceRequestMst> getAllService(){
		return serviceRequestMstService.getAllServices();
	}
	
	
	/* URL: http://localhost:8787/api/service/updateByTrackerId
	 * END POINT: /updateByTrackerId/{issue_flag}/{tracker_id}
	 * REQUEST: PUT
	 */
	
	
	@PutMapping("/updateByTrackerId")
	public HashMap<String, String> updateService(@RequestBody ServiceRequestMst serviceRequestMst) {
		
		HashMap<String, String> response =new HashMap <String,String>();
		
		int trackId = serviceRequestMstService.findByTrackerId(serviceRequestMst.getTracker_id());
		
		if (trackId == 1) {
			
			if(serviceRequestMst.getIssue_flag().toString().equals("A")||serviceRequestMst.getIssue_flag().toString().equals("R")) {
				int res = serviceRequestMstService.updateService(serviceRequestMst.getIssue_flag(), serviceRequestMst.getTracker_id());
				response.put("responseCode", String.valueOf(res));
				response.put("message", "Operation Successfull");
			}
			else {
				response.put("responseCode", "0");
				response.put("message", "Invalid Status Flag.");
			}
			
		}else {
			response.put("responseCode", "000");
			response.put("message", "Tracking Id Not Found.");
		}
		
		return response;
	}
	
	


	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
