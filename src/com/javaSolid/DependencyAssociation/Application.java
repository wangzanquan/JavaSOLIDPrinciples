package com.javaSolid.DependencyAssociation;

public class Application {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		/*
		car.startEngine();
		car.speedUp();
		car.stopEngin();
		*/
		
		//This is know as Dependency Association
		Driver driver = new Driver();
		driver.driveTheVehicle(car);
	}
}
