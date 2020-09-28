package com.vehicles.project;


import java.util.List;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}
	
	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addTwoWheels(frontWheel);
		addTwoWheels(backWheel);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
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
