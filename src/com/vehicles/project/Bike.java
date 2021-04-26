package com.vehicles.project;



public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Exception {//Constructor
		super(plate, brand, color);
	}
	
	public void addWheels(Wheel frontWheel, Wheel backWheel) {
		this.wheels.add(frontWheel);
		this.wheels.add(backWheel);
	
	}
	@Override
	public String toString() {
		return "Moto [Matricula= " + getPlate() + ", Marca= " + getBrand() + ", Color= " + getColor()
				+ "\n "+ "nº de Rodes: "+ this.getWheels().size()
				+ "\n Marca roda trasera: "+getWheels().get(0).getBrand()
				+ "\n Diametre roda trasera: "+getWheels().get(0).getDiameter()
				+ "\n Marca roda Davantera: "+getWheels().get(1).getBrand()
				+ "\n Diametre roda Davantera: "+getWheels().get(1).getDiameter();
	}

}
