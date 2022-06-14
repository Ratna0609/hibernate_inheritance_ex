package com.org.hibernate.ex.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.CHAR)  
@DiscriminatorValue(value="E") 
public class Employee {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "id")
	private int id;
	@Column (name="emp_Name")
	private String employeeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
