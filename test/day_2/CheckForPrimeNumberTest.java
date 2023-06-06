package day_2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckForPrimeNumberTest {

    @Test
    public void testIsPrime() {
        assertEquals(true, CheckForPrimeNumber.isPrime(2));
        assertEquals(true, CheckForPrimeNumber.isPrime(3));
        assertEquals(true, CheckForPrimeNumber.isPrime(5));
        assertEquals(false, CheckForPrimeNumber.isPrime(4));
        assertEquals(false, CheckForPrimeNumber.isPrime(6));
        assertEquals(false, CheckForPrimeNumber.isPrime(1));
    }
}