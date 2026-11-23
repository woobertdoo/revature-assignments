package com.vehiclerental;

public class Vehicle {
	protected String vehicleNumber;
	protected String model;
	protected double ratePerDay;
	protected int days;

	public Vehicle(String vehicleNumber, String model, double ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.ratePerDay = ratePerDay;
		this.days = days;
	}

	public double calculateRent() {
		return ratePerDay * days;
	}

	public String displayDetails() {
		return String.format("%s | %s | %d | $%.2f", vehicleNumber, model, days, calculateRent());
	}

}
