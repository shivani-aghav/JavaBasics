package com.techno.javabasics.abstraction;

public class Audi implements Car {

	public void brake() {
		System.out.println("break used in Audi");
	}

	public void accelerate() {
		System.out.println("Audi is accelerating");
	}

	public void gear() {
		System.out.println("Audi gear");
	}

}
