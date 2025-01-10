package IntroductoryProblems;

import java.util.Scanner;

public class TwoKnights {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        for (int k = 1; k <= n; k++) {
            long totalPairs = (long) k * k * (k * k - 1) / 2;
            long attackingPairs = (k > 2) ? 4L * (k - 1) * (k - 2) : 0;
            System.out.println(totalPairs - attackingPairs);
        }
    }
}

