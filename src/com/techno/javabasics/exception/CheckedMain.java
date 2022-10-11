package com.techno.javabasics.exception;

import java.util.Scanner;

public class CheckedMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age :");
		try {
			Voting.vote(scanner.nextInt());
		} catch (CheckedException e) {

		System.out.println(e.getMessage());
		}

	}

}
