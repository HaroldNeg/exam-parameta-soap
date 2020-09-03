package com.project.app.exam.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeDto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 16)
	private UUID id;
	
	private String names;
	
	private String surnames;
	
	private String documentType;
	
	private String documentNumber;
	
	private LocalDate birthDate;
	
	private LocalDate linkingCompanyDate;
	
	private String positionCompany;
	
	private Double salary;
	
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public LocalDate getbirthDate() {
		return birthDate;
	}
	public void setbirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public LocalDate getLinkingCompanyDate() {
		return linkingCompanyDate;
	}
	public void setLinkingCompanyDate(LocalDate linkingCompanyDate) {
		this.linkingCompanyDate = linkingCompanyDate;
	}
	public String getPositionCompany() {
		return positionCompany;
	}
	public void setPositionCompany(String positionCompany) {
		this.positionCompany = positionCompany;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [names=" + names + ", surnames=" + surnames + ", documentType=" + documentType
				+ ", documentNumber=" + documentNumber + ", birthDate=" + birthDate + ", linkingCompanyDate="
				+ linkingCompanyDate + ", positionCompany=" + positionCompany + ", salary=" + salary + "]";
	}
	
}
