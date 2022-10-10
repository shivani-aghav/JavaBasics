package com.techno.javabasics.restaurant;

import java.util.Scanner;

public class Restaurant1 {

	static double price;
	static String c;

	public static void main(String[] args) {

		String a[] = { "1.Vadapav = 15$ ", "2.Tea = 10$", "3.Coffee = 12$", "4.Samosa = 15$", "5.Kachori = 20$",
				"6.Dhokla = 30$" };
		int[] b = { 0, 15, 10, 12, 15, 20 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		do {
			int sum = 0;
			System.out.println("Enter the item number you want to buy :");
			Scanner scanner = new Scanner(System.in);

			int itemNumber = scanner.nextInt();

			if (itemNumber > 6) {
				try {
					throw new InvalidInputException("Invalid Input");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {

				System.out.println("How many would you like to have :");
				int amount = scanner.nextInt();
				sum = amount * b[itemNumber];

				System.out.println("Order Successful ,\nYour Total Amount is :" + sum + "\n");

			}
			System.out.println("would you like to order more? \npress y for yes and n for no ");
			c = scanner.next();

		} while (c.equalsIgnoreCase("y"));
	}
}
