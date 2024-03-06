package moduuli5_4;

public class PalindromeChecker {

    public boolean isPalindrome(String stage) {

        String cleaned = stage.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}
