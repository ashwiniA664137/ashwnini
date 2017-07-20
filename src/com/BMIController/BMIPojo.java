package com.BMIController;

import com.Controller.UserPojo;

public class BMIPojo extends UserPojo{
	double height;
	double weight;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public BMIPojo(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public BMIPojo() {
		super();
	}
	
}
