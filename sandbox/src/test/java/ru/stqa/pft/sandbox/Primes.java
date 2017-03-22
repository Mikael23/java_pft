package ru.stqa.pft.sandbox;

/**
 * Created by Михаил on 06.03.2017.
 */
public class Primes {

    public static boolean isPrime(int n) {
        int m = (int)Math.sqrt(n);

        for (int i = 2; i < m; i += 1) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static boolean isPrimeWhile(int n) {
        int i = 2;
        while (i < n && n % i != 0) {

            i++;
        }

        return 1 == n;
    }


    public static boolean isPrime(long n) {

        for (long i = 2; i < n; i += 1) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }
}