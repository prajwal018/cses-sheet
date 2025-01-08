package IntroductoryProblems;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = 0, r = 0;
        int global = 0;
        int len = 0;
        while (r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) len += 1;
            else {
                l = r;
                len = 1;
            }
            global = Math.max(len, global);
            r++;
        }
        System.out.println(global);
        sc.close();
    }
}
