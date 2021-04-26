package com.vehicles.project;


import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) throws Throwable  {
		vehiclecontroller vc = new vehiclecontroller();
		//Scanner t =new Scanner(System.in);
		//Console c = System.console(); // creo una console
		String tecla ;// Per continuar fent operacions
		int opciomenu;
		Scanner opcio = new Scanner(System.in);

		do {
			System.out.println("-------------------------------------");
			System.out.println("Operacions amb vehicles");
			System.out.println("-------------------------------------");
			System.out.println("1  - Crear cotxe");
			System.out.println("2  - Crear moto");
			System.out.println("3  - Sortir");
			opciomenu = opcio.nextInt();
			// int opcio = Integer.parseInt(c.readLine());
			if (opciomenu > 0 && opciomenu <= 3) { // Adaptar if al nombre d' opcions
			
					switch (opciomenu) {
					case 1:
						vc.createCar();
						break;
					case 2:
						vc.createBike();
						break;
					case 3:
						// ec.eliminarEdifici();
						return;
					}
			
			} else {
				System.out.println("Introdueïx una opció correcte");
			}

			 System.out.println("_______________________________________");
			// System.out.println("Operacions amb edificis:");
			// System.out.println("________________________");
			 System.out.print("\n¿Vols tornar a fer una operació (S/N)?\n");
			
			 tecla = opcio.next();

		} while (tecla.equals("s"));

		opcio.close();

	}

}
