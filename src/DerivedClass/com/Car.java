package DerivedClass.com;

import BaseClass.com.Vehicle;

public class Car extends Vehicle{
	private int numDoors;
	
	public Car(String make, String model,int year, int numDoor) {
		super(make, model, year);
		this.numDoors = numDoor;
	}
	
	public void displayCarInfo() {
		System.out.println("\ncar information");
		displayInfo();
		System.out.println("Number of doors: "+numDoors);
	}
}
