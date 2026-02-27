package BankingApp;

public class BankAccount {
    private double balance;  //encapsulation - hiding data

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0){
            this.balance=balance;
        }
    }

    public boolean withdraw(double amt){
        if(balance>=amt){
            balance = balance - amt;
            return true;
        }else{
            return false;
        }
    }

    public boolean deposit(double amt){
        if(amt>0){
            balance += amt;
            return true;
        }else{
            return false;
        }
    }



}
