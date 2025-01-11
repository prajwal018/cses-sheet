package IntroductoryProblems;

import java.util.Scanner;

public class BitStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        long MOD = 1_000_000_007;

        long result = modularExponentiation(2, n, MOD);

        System.out.println(result);
    }

    public static long modularExponentiation(long base, long exp, long mod) {
        long result = 1;

        while (exp > 0) {
            // If exp is odd, multiply the base with result
            if ((exp % 2) == 1) {
                result = (result * base) % mod;
            }

            // Square the base and reduce the exponent by half
            base = (base * base) % mod;
            exp /= 2;
        }

        return result;
    }
}
