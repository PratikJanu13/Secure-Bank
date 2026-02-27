package BankingApp;

public class SecurityGateway {
    public static boolean isAuthenticated(String token){
        // Real apps check a JWT here; we just check if the ID exists
        return token.startsWith("user_");
    }
}
