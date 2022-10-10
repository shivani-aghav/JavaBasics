package com.techno.javabasics.exception;

public class RuntimeExceptionMain {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(10000);

		try {
			bankAccount.withdraw(13000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
