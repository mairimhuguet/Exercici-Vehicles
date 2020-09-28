package com.vehicles.view;

import java.util.List;
import java.util.*;
import javax.swing.JOptionPane;

import com.vehicles.project.*;
import com.vehicles.project.Wheel;

	public class Main_Vehicles {
		
	
	public static void main(String[] args) throws Exception {
		
		
		//Preguntar a l'usuari si vol crear un cotxe o una moto
		
		Object seleccion = JOptionPane.showInputDialog(null, "Seleccione opcion", null, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Moto", "Coche"}, "moto"); 
		System.out.println("El usuario ha elegido la opción " +  seleccion + ".");
		
		
		//Si l'usuari tria COCHE
		
		if  (seleccion=="Coche") {
			
		
		// Demanar a l'usuari la matrícula, marca i color. 
		
		String askvehicle [] = new String [3];
		askvehicle[0] = JOptionPane.showInputDialog("Introduce la matrícula de tu coche");
		askvehicle[1] = JOptionPane.showInputDialog("Introduce la marca de tu coche");
		askvehicle[2] = JOptionPane.showInputDialog("Introduce el color de tu coche");
         
		
		//CREAR EL COTXE
		
        Car coche1 = new Car(askvehicle[0], askvehicle[1], askvehicle[2]);
       
        System.out.println("La matrícula del coche es " +  coche1.getPlate() + ", la marca es " + coche1.getBrand() + " y es de color " + coche1.getColor()+ ".");
       
        
        //Demanar a l'usuari les rodes traseres
        
        String WheelBrand = JOptionPane.showInputDialog("Introduce la marca de tus ruedas traseras");
        double WheelDiam = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diámetro de tus ruedas traseras"));
        Wheel wheel = new Wheel(WheelBrand, WheelDiam);
        List<Wheel> BackWheels = Arrays.asList(new Wheel[] {wheel, wheel});
       
        
        //Demanar a l'usuari les rodes delanteres
        
        WheelBrand = JOptionPane.showInputDialog("Introduce la marca de tus ruedas delanteras");
        WheelDiam = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diámetro de tus ruedas delanteras"));
        wheel = new Wheel(WheelBrand, WheelDiam);
        List<Wheel> FrontWheels = Arrays.asList(new Wheel[] {wheel, wheel});
        
        
        //Meter las ruedas (listas) al objeto coche1
      
		coche1.addWheels(FrontWheels, BackWheels);
		
		}
		
		//Si l'usuari tria MOTO
		
		if  (seleccion=="Moto") {
			
			// Demanar a l'usuari la matrícula, marca i color. 
			
			String askvehicle [] = new String [3];
			askvehicle[0] = JOptionPane.showInputDialog("Introduce la matrícula de tu moto");
			askvehicle[1] = JOptionPane.showInputDialog("Introduce la marca de tu moto");
			askvehicle[2] = JOptionPane.showInputDialog("Introduce el color de tu moto");
	         
	    	
			//CREAR LA MOTO
			
	        Car moto1 = new Car(askvehicle[0], askvehicle[1], askvehicle[2]);
	       
	        System.out.println("La matrícula de la moto es " +  moto1.getPlate() + ", la marca es " + moto1.getBrand() + " y es de color " + moto1.getColor()+ ".");
	       
	        
	        //Demanar a l'usuari la roda trasera
	        
	        String WheelBrand = JOptionPane.showInputDialog("Introduce la marca de tu rueda trasera");
	        double WheelDiam = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diámetro de tu rueda trasera"));
	        Wheel wheel = new Wheel(WheelBrand, WheelDiam);
	        List<Wheel> BackWheel = Arrays.asList(new Wheel[] {wheel});
	       
	        
	        //Demanar a l'usuari la roda delantera
	        
	        WheelBrand = JOptionPane.showInputDialog("Introduce la marca de tu rueda delantera");
	        WheelDiam = Double.parseDouble(JOptionPane.showInputDialog("Introduce el diámetro de tu rueda delantera"));
	        Wheel wheel1 = new Wheel(WheelBrand, WheelDiam);
	        List<Wheel> FrontWheel = Arrays.asList(new Wheel[] {wheel1});
	        
	        //Meter las ruedas (listas) al objeto moto1
	      
			moto1.addWheels(FrontWheel, BackWheel);
						
       
			}
		
	}
}

