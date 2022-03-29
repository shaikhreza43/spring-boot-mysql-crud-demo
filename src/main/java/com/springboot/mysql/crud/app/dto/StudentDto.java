/**
 * 
 */
package com.springboot.mysql.crud.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class StudentDto {

	@NotNull(message="Student Name Cannot be Null or Empty")
	private String studentName;

	@NotNull(message="Student Email Cannot be Null or Empty")
	@Email(message = "Enter a Valid Email")
	private String studentEmail;

	@NotNull(message="Student Mobile Cannot be Null or Empty")
	private String studentMobile;

	@NotNull(message="Student Address Cannot be Null or Empty")
	private String studentAddress;

	@NotNull(message="Student Age Cannot be Null or Empty")
	private Integer studentAge;

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	/**
	 * @return the studentMobile
	 */
	public String getStudentMobile() {
		return studentMobile;
	}

	/**
	 * @param studentMobile the studentMobile to set
	 */
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}

	/**
	 * @return the studentAddress
	 */
	public String getStudentAddress() {
		return studentAddress;
	}

	/**
	 * @param studentAddress the studentAddress to set
	 */
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	/**
	 * @return the studentAge
	 */
	public Integer getStudentAge() {
		return studentAge;
	}

	/**
	 * @param studentAge the studentAge to set
	 */
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	/**
	 * @param studentName
	 * @param studentEmail
	 * @param studentMobile
	 * @param studentAddress
	 * @param studentAge
	 */
	public StudentDto(String studentName, String studentEmail, String studentMobile, String studentAddress,
			Integer studentAge) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
		this.studentAddress = studentAddress;
		this.studentAge = studentAge;
	}

	/**
	 * 
	 */
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
