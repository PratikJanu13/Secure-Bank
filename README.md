# Secure-Bank
A robust, console-based banking backend simulation written in Java. This project serves as a practical implementation of OOP (Object-Oriented Programming) concepts, simulating how real-world banking services interact with databases and security gateways.🚀 FeaturesTransaction Management: Process withdrawals and deposits with automated validation.Security Layer: Integrated SecurityGateway to simulate token-based authentication for sensitive operations.Smart Accounts: Implementation of a SavingsAccount with a minimum balance maintenance rule ($500$).Mock Database: A centralized BankDatabase using HashMap to simulate persistent data storage and retrieval.🛠️ Core OOP Concepts AppliedInheritance: The SavingsAccount class extends BankAccount to reuse and specialize behavior.Polymorphism: Method overriding in withdraw and deposit to implement specific business rules.Encapsulation: Data is protected via private fields and accessed through controlled public methods.Separation of Concerns: Distinct classes for Business Logic (BankingService), Data Access (BankDatabase), and Security.

📂 Project Structure:
'''src/BankingApp/
├── BankAccount.java      # Base class for all account types
├── SavingsAccount.java   # Specialized account with min-balance logic
├── BankDatabase.java     # Mock DB simulating account storage
├── BankingService.java   # Core engine for processing transactions
├── SecurityGateway.java  # Authentication simulation layer
└── Test.java             # Main entry point for system testing'''


💻 Sample Usage:
The system handles various scenarios including successful transactions, unauthorized access attempts, and insufficient funds:

'''java
BankingService service = new BankingService();
// Standard transaction
service.processTransaction("user_103", 300);
// Deposit with security check
service.deposit("user_106", 3000);
'''
📝 Future Scope: 
Implementation of an Interface for different types of transactions.
Integration of Custom Exceptions for better error handling.
Addition of a CLI (Command Line Interface) for user interaction.
