package com.vehicles.project;

import java.util.List;

public class Car extends Vehicle {
	
	

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {//metode addwheels
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception { //metode addTwoWheels
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception("Les rodes han de ser iguals");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public String toString() {
		return "Cotxe [Matricula= " + getPlate() + ", Marca= " + getBrand() + ", Color= " + getColor()
				+ "\n "+ "nº de Rodes: "+ this.getWheels().size()
				+ "\n Marca roda trasera: "+getWheels().get(0).getBrand()
				+ "\n Diametre roda trasera: "+getWheels().get(0).getDiameter()
				+ "\n Marca roda Davantera: "+getWheels().get(1).getBrand()
				+ "\n Diametre roda Davantera: "+getWheels().get(1).getDiameter();
	}

}
