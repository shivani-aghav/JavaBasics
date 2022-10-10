package com.techno.javabasics.exception;

public class Voting {

	  public static void vote(int age) throws CheckedException {
	
			if (age >= 18) {
				System.out.println("You can vote");
			}  else {
				throw new CheckedException("Under age cannot vote");
			}
					
		}
}
