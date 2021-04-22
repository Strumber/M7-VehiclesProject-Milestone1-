package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;



public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected ArrayList<Wheel> wheels = new ArrayList<Wheel>();
	
	static final private Pattern patternplate = Pattern.compile("^[0-9]{4}[A-Z]{3}$");//regex Matrícula
	//static final private Pattern patternplate = Pattern.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");
	

	public Vehicle(String plate, String brand, String color) throws MatriculaInvalidaException{//constructor
		this.plate = plate;
		this.brand = brand;
		this.color = color;
		//if (plate.equals("No")) throw new Exception("\n"+"Error matícula"+"\n");
	
	}
	
	
	public static boolean esValida(String plate) {
		return patternplate.matcher(plate).matches();
	}
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) throws MatriculaInvalidaException {
		if(esValida(plate))
			this.plate = plate;
		else throw new MatriculaInvalidaException("Matricula no valida");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}
	
	
}
