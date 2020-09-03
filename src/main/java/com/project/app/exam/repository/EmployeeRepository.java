package com.project.app.exam.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.app.exam.model.EmployeeDto;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDto, UUID>{
	
}
