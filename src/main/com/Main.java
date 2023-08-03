package main.com;

import DerivedClass.com.Car;
import DerivedClass.com.MotorCycle;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Nexon","Grey",2022,4);
		MotorCycle motorcycle = new MotorCycle("Xpluse", "OffRoder", 2022, false);
		
		//Calling methods from base class
		car.star();
		car.stop();
		car.breake();
		
		motorcycle.star();
		motorcycle.accelerate();
		
		car.displayCarInfo();
		motorcycle.displayMotorCycelInfo();
		
	}
}
