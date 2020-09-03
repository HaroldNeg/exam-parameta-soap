package com.project.app.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negreteharold.exam.parameta.Employee;
import com.project.app.exam.mapper.EmployeeMapper;
import com.project.app.exam.model.EmployeeDto;
import com.project.app.exam.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	private EmployeeMapper mapper;

	@Override
	public boolean save(Employee employee) {
		try {
			EmployeeDto employeeDto = mapper.mapper(employee);
			repository.save(employeeDto);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
