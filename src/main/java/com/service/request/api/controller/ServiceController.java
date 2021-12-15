package com.service.request.api.controller;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.request.api.model.Parameters;
import com.service.request.api.procedure.ServiceRequestPrcCall;

@RestController
@RequestMapping("/api/service")
public class ServiceController {
	
    @Autowired
	private ServiceRequestPrcCall serviceRequestPrcCall;

	@PostMapping("/updateServiceRequest")
	public Map<String, Object> updateServiceRequest(@RequestBody Parameters parameters) {
		Map<String, Object> map = new HashMap<>();
		Parameters returnObj = serviceRequestPrcCall.parameters(parameters);
		map.put("flag", returnObj.getErrorFlag());
		map.put("message", returnObj.getErrorMessage());
		return map;
	}

}
