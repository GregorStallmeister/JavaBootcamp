package ai_aided_coding;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
    public static void main(String[] args) {
        int n = 100; // Number of primes to generate
        List<Integer> primes = generatePrimes(n);
        System.out.println("First " + n + " prime numbers: " + primes);
    }

    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2; // Start checking from the first prime number

        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }

        return primes;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
