package IntroductoryProblems;

import java.util.Scanner;

public class GrayCode {
    private static String toBinary(int num, int n) {
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(num));
        while (binary.length() < n) {
            binary.insert(0, "0");
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int totalGrayCodes = 1 << n; // 2^n Gray codes
        for (int i = 0; i < totalGrayCodes; i++) {
            int gray = i ^ (i >> 1); // Compute the i-th Gray code
            System.out.println(toBinary(gray, n)); // Convert to n-bit binary and print
        }

        scanner.close();
    }
}
