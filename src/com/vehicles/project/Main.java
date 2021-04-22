package com.vehicles.project;

import java.lang.Exception;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;

public class Main {

	String matricula;
	String Marca;
	String Color;

	public static void main(String[] args) throws Exception {

		// Fase 1
		System.out.println("\n" + " Milestone 1 :Fase 1" + "\n");
		// crear cotxe

		try {
			String matricula = JOptionPane.showInputDialog("Introdueïx la matrícula del cotxe");
			String marca = JOptionPane.showInputDialog("Introdueïx la marca del cotxe");
			String color = JOptionPane.showInputDialog("Introdueïx el color del cotxe");

			// Car cotxe1;

			Car cotxe1 = new Car(matricula, marca, color);
			System.out.println();
			System.out.println(cotxe1);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		ArrayList<Wheel> RodesTraseres = new ArrayList<Wheel>();
		ArrayList<Wheel> RodesDavanteres = new ArrayList<Wheel>();

		// Rodes

		String marcaRodesTraseres = JOptionPane.showInputDialog("Introdueïx la marca rodes traseres");
		try {
			double diametreRodesTraseres = Double
					.parseDouble(JOptionPane.showInputDialog("Introdueïx el diametre de les rodes traseres"));
		
		
		String marcaRodesDavanteres = JOptionPane.showInputDialog("Introdueïx la marca rodes davanteres");
		double diametreRodesDavanteres = Double
				.parseDouble(JOptionPane.showInputDialog("Introdueïx el diametre de les rodes davanteres"));

		// Wheel Rodes1= new Wheel(marcaRodesTraseres,diametreRodesTraseres);
		RodesTraseres.add(new Wheel(marcaRodesTraseres, diametreRodesTraseres));
		Wheel Rodes2 = new Wheel(marcaRodesDavanteres, diametreRodesDavanteres);
		RodesDavanteres.add(Rodes2);

		for (int d = 0; d < RodesTraseres.size(); d++) {
			System.out.println("Rodes Traseres Marca : " + marcaRodesTraseres + " diametre :" + diametreRodesTraseres);
		}

		for (int d = 0; d < RodesDavanteres.size(); d++) {
			System.out.println(
					"Rodes Davanteres Marca : " + marcaRodesDavanteres + " diametre :" + diametreRodesDavanteres);
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
