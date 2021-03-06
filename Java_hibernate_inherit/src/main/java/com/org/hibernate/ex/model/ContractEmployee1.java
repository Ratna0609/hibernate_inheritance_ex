/**
 * 
 */
package com.org.hibernate.ex.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nalaj
 *
 */
@Entity
@Table(name="C_employee")  
public class ContractEmployee1 extends Employee1 {
	@AttributeOverrides({  
	    @AttributeOverride(name="id", column=@Column(name="id")),  
	    @AttributeOverride(name="employeeName", column=@Column(name="emp_Name"))  
	})  
	

	@Column(name="pay_per_hour")  
    private float pay_per_hour;  
      
    @Column(name="contract_duration")  
    private String contract_duration;

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}  
}
