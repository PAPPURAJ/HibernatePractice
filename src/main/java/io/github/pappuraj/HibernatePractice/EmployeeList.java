package io.github.pappuraj.HibernatePractice;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "employee_list")
public class EmployeeList {
	@Column(name = "employee_id")
	@Id
	@GeneratedValue
	private int employeeId;
	private String name;
	private String phoneNumber;
	@Transient
	private String address;
	private Date dateOfBirth;
	@Lob
	private byte[] picture;
	public EmployeeList() {
		super();
	}
	public EmployeeList(String name, String phoneNumber, Date dateOfBirth, byte[] picture) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.picture = picture;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	@Override
	public String toString() {
		return "EmployeeList [employeeId=" + employeeId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", picture=" + Arrays.toString(picture) + "]";
	}
	
	
}
