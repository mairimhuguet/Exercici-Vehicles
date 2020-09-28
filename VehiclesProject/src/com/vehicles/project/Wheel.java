package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		
		//Diametro de la rueda entre 0.4-4
		
		if (diameter < 0.4 || diameter > 4)
			throw new Exception("el diametro tiene que estar entre 0.4 y 4");
		
		this.brand = brand;
		this.diameter = diameter;
	}
}
