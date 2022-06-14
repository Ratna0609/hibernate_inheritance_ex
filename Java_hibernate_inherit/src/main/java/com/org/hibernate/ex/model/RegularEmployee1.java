/**
 * 
 */
package com.org.hibernate.ex.model;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author nalaj
 *
 */

@Entity
@Table(name="R_employee")  
 
public class RegularEmployee1 extends Employee1 {
	@AttributeOverrides({  
	    @AttributeOverride(name="id", column=@Column(name="id")),  
	    @AttributeOverride(name="employeeName", column=@Column(name="emp_Name"))  
	})  
	@Column (name="emp_salary")
	private float salary;
	@Column (name="emp_bonus")
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	

}
