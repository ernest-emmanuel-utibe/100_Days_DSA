package day_3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckForPalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertEquals(true, CheckForPalindrome.isPalindrome("madam"));
        assertEquals(true, CheckForPalindrome.isPalindrome("racer"));
        assertEquals(false, CheckForPalindrome.isPalindrome("hello"));
        assertEquals(false, CheckForPalindrome.isPalindrome("world"));
    }

}