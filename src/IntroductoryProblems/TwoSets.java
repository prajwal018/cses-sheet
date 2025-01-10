package IntroductoryProblems;

import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long sum = (long) n * (n + 1) / 2;

        // If the sum is odd, division is not possible
        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");

            // Target sum for each subset
            long target = sum / 2;
            StringBuilder set1 = new StringBuilder();
            int s1 = 0;
            StringBuilder set2 = new StringBuilder();
            int s2 = 0;

            // Fill sets starting from the largest number
            for (int i = n; i >= 1; i--) {
                if (target >= i) {
                    s1++;
                    set1.append(i).append(" ");
                    target -= i;
                } else {
                    s2++;
                    set2.append(i).append(" ");
                }
            }

            // Print the two sets
            System.out.println(s1);
            System.out.print(set1);

            System.out.println();

            System.out.println(s2);
            System.out.print(set2);

        }


    }
}
