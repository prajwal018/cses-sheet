package IntroductoryProblems;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        scanner.close();

        long count = 0;

        // Counting factors of 5, avoiding any unnecessary operations
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }

        System.out.println(count);
    }
}