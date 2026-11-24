package com.employeemanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Employee[] employees = { new Employee(1, "Jamie", "Tech", 30000), new Employee(2, "Peter", "HR", 25000),
				new Employee(3, "Dustin", "Art", 50000), new Employee(4, "John", "Mechanics", 40000),
				new Employee(5, "Erin", "Customer Service", 20000) };
		Employee[] readEmployees = new Employee[5];

		try (FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			oos.writeObject(employees);
			System.out.println("Employees written");

			readEmployees = (Employee[]) ois.readObject();
			for (Employee emp : readEmployees) {
				System.out.println(emp);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
