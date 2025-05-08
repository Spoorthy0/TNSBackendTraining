package com.tnsif.Assignment1;

public class BankAccount {
	int accountNo;
	double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) throws InvalidAmountException{
			if(amount>25000) {
				throw new InvalidAmountException("Exceeds deposit limit");
			}
			else {
				this.balance=this.balance+amount;
				System.out.println("The Bank Balance is :"+this.balance);
			}
		}
	public void withdraw(double amount) throws InsufficientFundsException{
			if(this.balance<amount) {
				throw new InsufficientFundsException("Amount exceeds balance");
			}
			else {
				this.balance=this.balance-amount;
				System.out.println("The Bank Balance is :"+this.balance);
			
			
		}
	}
}


