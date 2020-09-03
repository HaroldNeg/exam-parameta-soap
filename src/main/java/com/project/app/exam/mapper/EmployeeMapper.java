package com.project.app.exam.mapper;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.negreteharold.exam.parameta.Employee;
import com.project.app.exam.model.EmployeeDto;

@Component
public class EmployeeMapper {

	public EmployeeDto mapper(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setNames(employee.getNames());
		employeeDto.setSurnames(employee.getSurnames());
		employeeDto.setDocumentType(employee.getDocumentType());
		employeeDto.setDocumentNumber(employee.getDocumentNumber());
		employeeDto.setbirthDate(LocalDate.of(employee.getBirthDate().getYear(), employee.getBirthDate().getMonth(),
				employee.getBirthDate().getDay()));
		employeeDto.setLinkingCompanyDate(LocalDate.of(employee.getLinkingCompanyDate().getYear(),
				employee.getLinkingCompanyDate().getMonth(), employee.getLinkingCompanyDate().getDay()));
		employeeDto.setPositionCompany(employee.getPositionCompany());
		employeeDto.setSalary(employee.getSalary());
		return employeeDto;
	}
}
