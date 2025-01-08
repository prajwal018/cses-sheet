package IntroductoryProblems;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long prev = 0;
        long moves = 0;
        for (int i = 0; i < n; i++) {
            long cur = sc.nextInt();
            long diff = 0;
            if (i != 0) {
                if (prev > cur) {
                    diff += prev - cur;
                    moves += diff;
                }
            }
            prev = cur + diff;
        }
        System.out.println(moves);
        sc.close();
    }
}
