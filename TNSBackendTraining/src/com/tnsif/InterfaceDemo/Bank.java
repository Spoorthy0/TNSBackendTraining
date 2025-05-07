package com.tnsif.InterfaceDemo;

public interface Bank {
        int DEPOSIT_LIMIT=25000;
        void deposit(double amount);
        void withdraw(double amount);
}
