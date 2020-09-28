package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
//		addTwoWheels(frontWheels);
//		addTwoWheels(backWheels);
	}

		
	//Para imprimir
	
		public String getPlate() {
			return new String(plate);
		}
		public String getBrand() {
			return new String(brand);
		}
		public String getColor() {
			return new String(color);
		}
}