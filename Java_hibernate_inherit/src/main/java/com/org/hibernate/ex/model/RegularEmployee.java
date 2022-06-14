/**
 * 
 */
package com.org.hibernate.ex.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author nalaj
 *
 */

@Entity
@DiscriminatorValue("R")
public class RegularEmployee extends Employee {
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
