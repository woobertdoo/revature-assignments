package com.vehiclerental;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		Scanner sc = new Scanner(System.in);
		int vehicleCount;

		System.out.print("Enter number of vehicles: ");
		vehicleCount = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < vehicleCount; i++) {
			String model;
			String vehicleNum;
			int days;
			double ratePerDay;
			int carOrBike;

			System.out.print("Enter type (1-Car, 2-Bike): ");
			carOrBike = sc.nextInt();
			sc.nextLine();

			while (carOrBike != 1 && carOrBike != 2) {
				System.out.println("Invalid vehicle type");
				System.out.print("Enter type (1-Car, 2-Bike): ");
				carOrBike = sc.nextInt();
				sc.nextLine();
			}

			System.out.print("Enter Vehicle Number: ");
			vehicleNum = sc.nextLine();
			sc.nextLine();

			System.out.print("Enter Model: ");
			model = sc.nextLine();
			sc.nextLine();

			System.out.print("Enter Daily Rate: ");
			ratePerDay = sc.nextDouble();
			sc.nextLine();

			System.out.print("Enter Days: ");
			days = sc.nextInt();
			sc.nextLine();

			if (carOrBike == 1) {
				System.out.print("Enter Insurance Fee: ");
				double insuranceFee = sc.nextDouble();
				sc.nextLine();
				vehicles.add(new Car(insuranceFee, vehicleNum, model, ratePerDay, days));
			} else if (carOrBike == 2) {
				vehicles.add(new Bike(vehicleNum, model, ratePerDay, days));
			}
		}

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.displayDetails());
		}
	}

}
