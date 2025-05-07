package com.tnsif.InterfaceDemo;

public class BankImple implements Bank {
	double balance=2000;

	@Override
	public void deposit(double amount) {
		if(amount>0 && amount<=DEPOSIT_LIMIT) {
			balance=balance+amount;
			System.out.println("The balance is "+balance);
		}
		else {
			System.err.println("Invalid amount");
		}
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance=balance-amount;
			System.out.println("The balance after withdraw is "+balance);
		}
		else {
			System.err.println("Amount exceeds the limit");
		}
	}
          
}
