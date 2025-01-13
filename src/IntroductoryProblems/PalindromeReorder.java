package IntroductoryProblems;

import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] charCount = new int[26];
        for (char c : input.toCharArray()) {
            charCount[c - 'A']++;
        }

        // Variables to hold parts of the palindrome
        StringBuilder halfPalindrome = new StringBuilder();
        char oddChar = 0; // The character that can appear an odd number of times
        int oddCount = 0; // Number of characters with odd frequencies

        // Build half of the palindrome and check for odd character counts
        for (int i = 0; i < 26; i++) {
            if (charCount[i] % 2 != 0) {
                oddCount++;
                oddChar = (char) (i + 'A');
            }

            // Add half of the character count to the halfPalindrome
            for (int j = 0; j < charCount[i] / 2; j++) {
                halfPalindrome.append((char) (i + 'A'));
            }
        }

        // If there's more than one character with an odd frequency, no solution is possible
        if (oddCount > 1) {
            System.out.println("NO SOLUTION");
            return;
        }

        // Construct the full palindrome
        String half = halfPalindrome.toString();
        String palindrome = half;
        if (oddCount == 1) {
            palindrome += oddChar;
        }
        palindrome += new StringBuilder(half).reverse().toString();

        System.out.println(palindrome);
        sc.close();
    }
}
