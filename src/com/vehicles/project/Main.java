package com.vehicles.project;
import java.util.ArrayList;


import javax.swing.*;

public class Main {
	
	String matricula;
	String Marca;
	String Color;
	

	public static void main(String[] args) {
		//Fase 1
		System.out.println("\n"+ " Milestone 1 :Fase 1" + "\n");
		// crear cotxe
		String matricula=JOptionPane.showInputDialog("Introdue�x la matr�cula del cotxe");
		String marca=JOptionPane.showInputDialog("Introdue�x la marca del cotxe");
		String color=JOptionPane.showInputDialog("Introdue�x el color del cotxe");
		
		Car cotxe1 = new Car(matricula,marca,color);
		
		System.out.println("El cotxe te la matr�cula: " + cotxe1.getPlate()+ " es de la marca " + cotxe1.getBrand()
					+ " i es de color "+cotxe1.getColor() );
		ArrayList<Wheel> RodesTraseres = new ArrayList<Wheel>();
		ArrayList<Wheel> RodesDavanteres = new ArrayList<Wheel>();
		
		//Rodes
		
		String marcaRodesTraseres=JOptionPane.showInputDialog("Introdue�x la marca rodes traseres");
		double diametreRodesTraseres=Double.parseDouble(JOptionPane.showInputDialog("Introdue�x el diametre de les rodes traseres"));
		String marcaRodesDavanteres=JOptionPane.showInputDialog("Introdue�x la marca rodes davanteres");
		double diametreRodesDavanteres=Double.parseDouble(JOptionPane.showInputDialog("Introdue�x el diametre de les rodes davanteres"));
		
		
		//Wheel Rodes1= new Wheel(marcaRodesTraseres,diametreRodesTraseres);
		RodesTraseres.add (new Wheel(marcaRodesTraseres,diametreRodesTraseres));	
		Wheel Rodes2= new Wheel(marcaRodesDavanteres,diametreRodesDavanteres);
		RodesDavanteres.add (Rodes2);		
		
		for (int d=0; d< RodesTraseres.size() ; d++) {
			System.out.println("Rodes Traseres Marca : "+marcaRodesTraseres+" diametre :"+ diametreRodesTraseres );
		}
				
		for (int d=0; d< RodesDavanteres.size() ; d++) {
			System.out.println("Rodes Davanteres Marca : "+marcaRodesDavanteres+" diametre :"+ diametreRodesDavanteres );
		}
		
		
		
		

	}

}
