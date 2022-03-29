/**
 * 
 */
package com.springboot.mysql.crud.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STUDENT_ID")
	private Long studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "STUDENT_EMAIL",unique = true)
	private String studentEmail;

	@Column(name = "STUDENT_MOBILE")
	private String studentMobile;

	@Column(name = "STUDENT_ADDRESS")
	private String studentAddress;

	@Column(name = "STUDENT_AGE")
	private Integer studentAge;

	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

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
	 * @param studentId
	 * @param studentName
	 * @param studentEmail
	 * @param studentMobile
	 * @param studentAddress
	 * @param studentAge
	 */
	public Student(Long studentId, String studentName, String studentEmail, String studentMobile, String studentAddress,
			Integer studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobile = studentMobile;
		this.studentAddress = studentAddress;
		this.studentAge = studentAge;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
