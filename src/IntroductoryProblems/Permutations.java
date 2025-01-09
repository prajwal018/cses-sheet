package IntroductoryProblems;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 3 || n == 2) {
            System.out.print("NO SOLUTION");
            return;
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                s1.append(i).append(" ");
            else
                s2.append(i).append(" ");
        }
        System.out.printf("%s%s", s1, s2);
        sc.close();
    }
}
