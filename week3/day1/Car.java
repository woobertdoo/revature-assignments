package com.vehiclerental;

public class Car extends Vehicle {
	private double insuranceFee;

	public Car(double insuranceFee, String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceFee = insuranceFee;
	}

	@Override
	public double calculateRent() {
		return (ratePerDay + insuranceFee) * days;
	}

	@Override
	public String displayDetails() {
		return "Car | " + super.displayDetails();
	}
}
