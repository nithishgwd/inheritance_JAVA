package DerivedClass.com;

import BaseClass.com.Vehicle;

public class MotorCycle extends Vehicle{

	private boolean hasSidecar;
	public MotorCycle(String make, String model, int year, boolean hassidecar) {
		super(make, model,year);
		this.hasSidecar = hassidecar;
	}
	
	public void displayMotorCycelInfo() {
		System.out.println("\nMotorcycle Information");
		displayInfo();
		System.out.println("Has sidecar: "+hasSidecar);
	}
}
