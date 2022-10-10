package com.techno.javabasics.restaurant;

import java.util.Scanner;

public class Restaurant {

	static double price;
	static String c;

	public static void main(String[] args) {

		String a[] = { "1.Vadapav = 15$ ", "2.Tea = 10$", "3.Coffee = 12$", "4.Samosa = 15$", "5.Kachori = 20$",
				"6.Dhokla = 30$" };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		do {

			System.out.println("Enter the item number you want to buy :");
			Scanner scanner = new Scanner(System.in);
			int itemNumber = scanner.nextInt();

			switch (itemNumber) {
			case 1:
				price = 15;
				break;
			case 2:
				price = 10;
				break;
			case 3:
				price = 12;
				break;
			case 4:
				price = 15;
				break;
			case 5:
				price = 20;
				break;
			case 6:
				price = 30;
				break;
			default:
				System.out.println("No item selected \n");
				break;
			}

			System.out.println("How many would you like to have :");
			int amount = scanner.nextInt();
			double totalPrice = amount * price;

			System.out.println("Order Successful ,\nYour Total Amount is :" + totalPrice + "\n");

			System.out.println("would you like to order more? \npress y for yes and n for no ");
			c = scanner.next();

		} while (c.equalsIgnoreCase("y"));
	}
}
