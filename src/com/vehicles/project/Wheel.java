package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter)throws Exception { //constructor
		
		this.brand = brand;
		if (this.diameter>0.4 || this.diameter <4.0) throw new Exception ("el diametre ha de ser superior a 0.4 i inferior a 4");
			//this.diameter = diameter;
		
			System.out.println();
		
		
		
	}

	

}
