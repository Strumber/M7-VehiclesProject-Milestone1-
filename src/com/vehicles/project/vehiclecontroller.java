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
		boolean valmatricula = false;
		do {
			System.out.println("Introdueïx la MATRICULA del cotxe");
			matricula = tecla.nextLine();
			// verificar entrada matícula
			if (matricula.matches("\\d{4}[a-zA-Z]{3}") || matricula.matches("\\d{4}[a-zA-Z]{2}")) {
				valmatricula = true;
			} else {
				System.out
						.println("Matrícula incorrecte, la matricula ha de tenir 4 numeros i dues o tres lletres !!!!");
			}
		} while (valmatricula == false);

		System.out.println("Introdueïx la MARCA del cotxe");
		marca = tecla.nextLine();
		System.out.println("Introdueïx el COLOR del cotxe");
		color = tecla.nextLine();

		Car cotxe = new Car(matricula, marca, color);

		// Rodes cotxe

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
		System.out.println("Introdueïx el Diametre de les rodes Davanteres");
		diametreRodesDavanteres = tecla.nextLine();

		try {
			Wheel r1 = new Wheel(marcaRodesTraseres, Double.parseDouble(diametreRodesTraseres));// roda dreta trasera
			Wheel r2 = new Wheel(marcaRodesTraseres, Double.parseDouble(diametreRodesTraseres));// roda esquerra trasera
			Wheel r3 = new Wheel(marcaRodesDavanteres, Double.parseDouble(diametreRodesDavanteres)); // roda dreta
																										// davantera
			Wheel r4 = new Wheel(marcaRodesDavanteres, Double.parseDouble(diametreRodesDavanteres)); // roda esquerra
																										// davantera

			List<Wheel> RodesTraseres = new ArrayList<Wheel>();
			RodesTraseres.add(r1);
			RodesTraseres.add(r2);
			List<Wheel> RodesDavanteres = new ArrayList<Wheel>();
			RodesDavanteres.add(r3);
			RodesDavanteres.add(r4);

			cotxe.addWheels(RodesDavanteres, RodesTraseres);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(cotxe);

//tecla.close();
	}

	public void createBike() throws Exception {
		Scanner tecla = new Scanner(System.in);
		System.out.println("\n" + " Milestone 1 :Fase 1" + "\n"); // crear cotxe
		boolean valmatricula = false;
		do {
			System.out.println("Introdueïx la MATRICULA de la Moto");
			matricula = tecla.nextLine();
			// verificar entrada matícula
			if (matricula.matches("\\d{4}[a-zA-Z]{3}") || matricula.matches("\\d{4}[a-zA-Z]{2}")) {
				valmatricula = true;
			} else {
				System.out
						.println("Matrícula incorrecte, la matricula ha de tenir 4 numeros i dues o tres lletres !!!!");
			}
		} while (valmatricula == false);

		System.out.println("Introdueïx la MARCA de la Moto");
		marca = tecla.nextLine();
		System.out.println("Introdueïx el COLOR de la Moto");
		color = tecla.nextLine();

		Bike moto = new Bike(matricula, marca, color);

		// Rodes moto

		String marcaRodaTrasera;
		String diametreRodaTrasera;
		String marcaRodaDavantera;
		String diametreRodaDavantera;

		System.out.println("Introdueïx la Marca roda Trasera");
		marcaRodaTrasera = tecla.nextLine();
		System.out.println("Introdueïx el Diametre de les roda Trasera");
		diametreRodaTrasera = tecla.nextLine();
		System.out.println("Introdueïx la Marca roda Davantera");
		marcaRodaDavantera = tecla.nextLine();
		System.out.println("Introdueïx el Diametre de la roda Davanteres");
		diametreRodaDavantera = tecla.nextLine();

		try {
			Wheel r1 = new Wheel(marcaRodaTrasera, Double.parseDouble(diametreRodaTrasera));// roda trasera
			Wheel r2 = new Wheel(marcaRodaDavantera, Double.parseDouble(diametreRodaDavantera));// roda trasera
																								// davantera

			moto.addWheels(r1, r2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(moto);

		// tecla.close();
	}

}
