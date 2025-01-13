package IntroductoryProblems;

import java.util.Scanner;

public class CoinPiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sb.append((a + b) % 3 == 0 &&
                    2 * a >= b && 2 * b >= a ?
                    "YES" :
                    "NO"
            ).append("\n");
        }
        System.out.println(sb);
        sc.close();

    }
}
