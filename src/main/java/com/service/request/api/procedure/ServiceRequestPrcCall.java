package com.service.request.api.procedure;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.request.api.model.Parameters;

@Service
public class ServiceRequestPrcCall {
	
	@Autowired
	private EntityManager entityManager;
	
	public Parameters parameters(Parameters parameters) {
		
		Parameters returnObj = new Parameters();
		
		
		StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("PKG_SERVICE_MAIN.PRC_SERVICE_STATUS");
		storedProcedureQuery.registerStoredProcedureParameter(0, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        
        storedProcedureQuery.setParameter(0, Optional.ofNullable(parameters.getTracker_id()).orElse(""));
        storedProcedureQuery.setParameter(1, Optional.ofNullable(parameters.getAc_no()).orElse(""));
        storedProcedureQuery.setParameter(2, Optional.ofNullable(parameters.getIssue_flag()).orElse(""));
        
        storedProcedureQuery.execute();
        
        returnObj.setErrorFlag((String) storedProcedureQuery.getOutputParameterValue(3));
        returnObj.setErrorMessage((String) storedProcedureQuery.getOutputParameterValue(4));
        
        
        
        return returnObj;
        
        
		
	}

}
