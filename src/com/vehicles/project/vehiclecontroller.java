package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class vehiclecontroller {

	String matricula;
	String marca;
	String color;
	
	public void createCar() throws Exception {
		Scanner tecla = new Scanner(System.in);
		
		// Fase 1
		System.out.println("\n" + " Milestone 1 :Fase 1" + "\n"); // crear cotxe

		System.out.println("Introdueïx la MATRICULA del cotxe");
		matricula = tecla.nextLine();
		System.out.println("Introdueïx la MARCA del cotxe");
		marca = tecla.nextLine();
		System.out.println("Introdueïx el COLOR del cotxe");
		color = tecla.nextLine();
		
		Car cotxe = new Car(matricula, marca, color);
		
		// Rodes
		
			String marcaRodesTraseres;
			String diametreRodesTraseres;
			String marcaRodesDavanteres;
			String diametreRodesDavanteres;
			
			System.out.println("Introdueïx la Marca rodes Traseres");
			marcaRodesTraseres = tecla.nextLine();
			System.out.println("Introdueïx el Diametre de les rodes Traseres");
			diametreRodesTraseres = tecla.nextLine();
			System.out.println("Introdueïx la Marca rodes Davanteres");
			marcaRodesDavanteres = tecla.nextLine();
			System.out.println("Introdueïx el Diametre de les rode Davanteres");
			diametreRodesDavanteres = tecla.nextLine();
			
			try {
			Wheel r1 = new Wheel (marcaRodesTraseres, Double.parseDouble(diametreRodesTraseres));//roda dreta trasera
			Wheel r2 = new Wheel (marcaRodesTraseres, Double.parseDouble(diametreRodesTraseres));//roda esquerra trasera
			Wheel r3 = new Wheel (marcaRodesDavanteres, Double.parseDouble(diametreRodesDavanteres)); // roda dreta davantera
			Wheel r4 = new Wheel (marcaRodesDavanteres, Double.parseDouble(diametreRodesDavanteres)); // roda esquerra davantera
			
			List<Wheel> RodesTraseres = new ArrayList<Wheel>();
			RodesTraseres.add(r1);
			RodesTraseres.add(r2);
			List<Wheel> RodesDavanteres = new ArrayList<Wheel>();
			RodesDavanteres.add(r3);
			RodesDavanteres.add(r4);
			
			
				cotxe.addWheels(RodesDavanteres, RodesTraseres);
			}catch(Exception e) {
				e.printStackTrace();
			}
										
					System.out.println(cotxe);
			

	}
	public void createBike() throws Exception {
}
}
