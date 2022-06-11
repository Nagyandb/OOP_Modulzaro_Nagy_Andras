package hu.progmatic.TEST;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @org.junit.jupiter.api.Test
    void isPrime() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));


        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(20254685));
    }
}