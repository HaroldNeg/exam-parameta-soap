package com.project.app.exam.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.negreteharold.exam.parameta.SaveEmployeeRequest;
import com.negreteharold.exam.parameta.SaveEmployeeResponse;
import com.project.app.exam.service.IEmployeeService;

@Endpoint
public class EmployeeEndpoint {
	
	private static final String NAMESPACE_URI = "http://negreteharold.com/exam/parameta";
	
	@Autowired
	private IEmployeeService service;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "saveEmployeeRequest")
	public @ResponsePayload SaveEmployeeResponse saveEmployee(@RequestPayload SaveEmployeeRequest request) {
		SaveEmployeeResponse response = new SaveEmployeeResponse();
		if (service.save(request.getEmployee())) {
			response.setResponse("Se ha guardado exitosamente");
		} else {
			response.setResponse("Ocurrió un error.");
		}
		return response;
	}
}
