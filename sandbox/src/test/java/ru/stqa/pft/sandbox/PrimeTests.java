package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Михаил on 06.03.2017.
 */
public class PrimeTests {

    @Test

    public void testPrimesFast() {
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));


    }

    @Test

    public void testNonPrimes() {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));


    }

    @Test

    public void testNonPrimesLong() {

        long n = Integer.MAX_VALUE;
        Assert.assertTrue(Primes.isPrime(n));

    }
}