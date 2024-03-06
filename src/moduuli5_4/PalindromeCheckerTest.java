package moduuli5_4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PalindromeCheckerTest {

@Test
public void testIsPalindrome() {
    PalindromeChecker checker = new PalindromeChecker();

    assertTrue(checker.isPalindrome("radar"));
    assertTrue(checker.isPalindrome("level"));
    assertTrue(checker.isPalindrome("12321"));

    assertFalse(checker.isPalindrome("hello"));
    assertFalse(checker.isPalindrome("world"));





}
}
