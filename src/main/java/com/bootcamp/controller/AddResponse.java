package com.bootcamp.controller;

public class AddResponse {

	private String message;
	private Integer sum;
	
	public AddResponse(int toAdd, String message) {
		this.sum = 10;
		this.sum += toAdd;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

}
