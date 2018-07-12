package com.javaSolid.DependencyAssociation;

public class Driver {
	public void driveTheVehicle(Vehicle vi) {
		vi.startEngine();
		vi.speedUp();
		vi.stopEngin();
	}
}
