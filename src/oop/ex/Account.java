package oop.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
     if (balance < 0) {
         System.out.println("잔액부족");
            balance += amount;
        }
        }
    }

