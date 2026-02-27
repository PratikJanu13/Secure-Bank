package BankingApp;
import java.util.HashMap;


    // This class simulates the Database (Pantry)
    class BankDatabase {
        private static HashMap<String, BankAccount> accounts = new HashMap<>();

        static {
            // "Hardcoded" seed data - simulating a DB table
            accounts.put("user_101", new SavingsAccount(5000.0));
            accounts.put("user_102", new SavingsAccount(1200.0));
            accounts.put("user_103", new SavingsAccount(6700.0));
            accounts.put("user_104", new SavingsAccount(1345.0));
            accounts.put("user_105", new BankAccount(600));
            accounts.put("user_106", new SavingsAccount(600));
        }

        public static  BankAccount getAccount(String id){
            return accounts.get(id);
        }

    }
