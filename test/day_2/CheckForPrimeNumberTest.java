package day_2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CheckForPrimeNumberTest {

    @Test
    public void testIsPrime() {
        assertTrue(CheckForPrimeNumber.isPrime(2));
        assertTrue(CheckForPrimeNumber.isPrime(3));
        assertTrue(CheckForPrimeNumber.isPrime(5));
        assertTrue(CheckForPrimeNumber.isPrime(4));
        assertTrue(CheckForPrimeNumber.isPrime(6));
        assertTrue(CheckForPrimeNumber.isPrime(1));
    }
}