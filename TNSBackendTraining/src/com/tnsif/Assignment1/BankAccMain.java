package com.tnsif.Assignment1;

public class BankAccMain {

	public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
		BankAccount obj=new BankAccount(2300);
		try {
		obj.deposit(2800);}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		try {
			obj.withdraw(280);}
			catch(InsufficientFundsException e) {
				System.out.println(e.getMessage());
			}

	}

}
