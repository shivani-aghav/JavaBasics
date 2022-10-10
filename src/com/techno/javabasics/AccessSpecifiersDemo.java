package com.techno.javabasics;

public class AccessSpecifiersDemo {

	public void publicModifier() {
		System.out.println("publicModifier");
	}

	private void privateModifier() {
		System.out.println("privateModifier");
	}

	protected void protectedModifier() {
		System.out.println("protectedModifier");
	}
	
	void defaultModifier() {
		System.out.println("defaultModifier");
	}
 
	public static void main(String[] args) {
		AccessSpecifiersDemo accessSpecifiersDemo=new AccessSpecifiersDemo();
		accessSpecifiersDemo.publicModifier();
		accessSpecifiersDemo.privateModifier();
		accessSpecifiersDemo.protectedModifier();
		accessSpecifiersDemo.defaultModifier();
	}
}
