package com.techno.javabasics.exception;

public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("You withdrawn is successful :"+balance);
		}else {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
	}
}
