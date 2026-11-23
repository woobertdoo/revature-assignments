package com.vehiclerental;

public class Bike extends Vehicle {

	private final int discountPercentage = 10;

	public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	@Override
	public double calculateRent() {
		return (ratePerDay * days) * (1 - (double) discountPercentage / 100);
	}

	@Override
	public String displayDetails() {
		return "Bike | " + super.displayDetails();
	}
}
