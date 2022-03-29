/**
 * 
 */
package com.springboot.mysql.crud.app.common;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public class Document<T> {

	private T data;
	private int statusCode;
	private String message;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @param data
	 * @param statusCode
	 * @param message
	 */
	public Document(T data, int statusCode, String message) {
		super();
		this.data = data;
		this.statusCode = statusCode;
		this.message = message;
	}

	/**
	 * 
	 */
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

}
