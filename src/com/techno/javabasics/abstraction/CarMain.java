package com.techno.javabasics.abstraction;

public class CarMain {

	public static void main(String[] args) {
       Car car = CarFactory.getCar();
       Driver drive=new Driver();
       drive.drive(car);
	}
}
 