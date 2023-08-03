package BaseClass.com;

public class Vehicle {
	protected String make;
	protected String model;
	protected int year;
		
	public Vehicle(String make, String model, int year) {
		// TODO Auto-generated constructor stub
		this.make = make;
		this.model = model;
		this.year = year;
	}
	

	public void star() {
		System.out.println("Vehicle is starting....");
	}
	
	public void stop() {
		System.out.println("Vehicle is stoping...");
	}
	
	public void accelerate() {
		System.out.println("Vehicle is accelerating...");
	}
	
	public void breake() {
		System.out.println("Vehicle is breaking...");
	}
	
	public void displayInfo() {
		System.out.println("Make: "+make);
		System.out.println("model: "+model);
		System.out.println("year: "+year);
	}
}
