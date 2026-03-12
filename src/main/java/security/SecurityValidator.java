package security;

public class SecurityValidator {

    public void detectSQLInjection(String input) {
        if (input.contains("' OR") || input.contains("--")) {
            System.out.println("⚠ Potential SQL Injection Detected!");
        } else {
            System.out.println("Input is Safe.");
        }
    }
}