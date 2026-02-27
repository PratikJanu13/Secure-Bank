package BankingApp;

public class Test {
    public static void main(String[] args) {
        BankingService service = new BankingService();
        service.processTransaction("user_103",300);
        service.processTransaction("user_101",6798);
        service.processTransaction("user_103",5460);
        service.processTransaction("user_105",200);
        service.deposit("user_106",300);
        service.processTransaction("user_106",200);

    }
}
