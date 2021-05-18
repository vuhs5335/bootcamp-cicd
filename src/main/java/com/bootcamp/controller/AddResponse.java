package com.bootcamp.controller;

public class AddResponse {

	private Integer sum;
	
	public AddResponse(int toAdd) {
		this.sum = 10;
		this.sum += toAdd;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
}
