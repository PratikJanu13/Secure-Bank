package BankingApp;

public class BankingService {
    public void processTransaction(String userId, double amt) {
        if (!SecurityGateway.isAuthenticated(userId)) {
            System.out.println("401-unauthorized: Invalid token");
            return;
        }

        BankAccount account = BankDatabase.getAccount(userId);
            boolean success = account.withdraw(amt);
            if(success){
                System.out.println("201-Transaction Successful. New Balance: "+account.getBalance());
            }else{
                System.out.println("400-Bad Request. Unsuccessful Maybe Insufficient funds or below limit");
            }

    }

    public void deposit(String userId, double amt){
        if(!SecurityGateway.isAuthenticated(userId)){
            System.out.println("401-unauthorized: Invalid token");
            return;
        }
        BankAccount account = BankDatabase.getAccount(userId);
        boolean success = account.deposit(amt);
        if(success){
            System.out.println("201- "+amt+" deposited. New Balance: "+account.getBalance());
        }else{
            System.out.println("400-Bad Request. Cannot deposit negative amount or zero");
        }
    }


}
