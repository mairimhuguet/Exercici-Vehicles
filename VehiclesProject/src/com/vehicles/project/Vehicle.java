package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	public String plate;
	public String brand;
	public String color;
	public List<Wheel> wheels = new ArrayList<Wheel>();
	
	public Vehicle(String plate, String brand, String color) throws Exception {
	
	//La matricula tiene que tener 4 numeros y 2-3 letras. Se cuenta cuantos numeros y cuantas letras hay. 
	//Si no cumple, te sale el texto de lo que tiene que cumplir
		
		int CountNumber = 0;
		int CountLetter = 0;
		Boolean isnumber = false;
		
		
		//Contar las letras y números
		
		for(int i=0; i < plate.length(); i++)
		{
			isnumber = Character.isDigit(plate.charAt(i));
			
			if(isnumber) {
				CountNumber++;
			}
			else {
				CountLetter++;
			}
		}
		
		//Restricciones
		
		if (CountNumber != 4)
			throw new Exception("matrícula tiene que tener 4 números");
		
		if (CountLetter < 2 || CountLetter > 3)
			throw new Exception("matrícula tiene que tener 2 o 3 letras");
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
}
