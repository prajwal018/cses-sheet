package IntroductoryProblems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long totalSum = 0;

        for (int i = 1; i <= n; i++)
            totalSum += i;

        for (int i = 1; i < n; i++)
            totalSum -= sc.nextLong();

        System.out.println(totalSum);
    }
}
