package BankingApp;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amt) {
        if(super.getBalance()-amt >= 500){
            super.setBalance(super.getBalance()-amt);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deposit(double amt) {
        if(amt>0){
            super.setBalance(super.getBalance()+amt);
            return true;
        }else{
            return false;
        }
    }
}
