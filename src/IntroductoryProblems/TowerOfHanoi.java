package IntroductoryProblems;

import java.util.Scanner;

public class TowerOfHanoi {
    // Function to solve Tower of Hanoi and print the moves
    public static void solveHanoi(int n, int source, int auxiliary, int destination) {
        if (n == 0) return;

        // Move top (n-1) disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);
        // Move the nth disk from source to destination
        System.out.println(source + " " + destination);
        // Move the (n-1) disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Minimum number of moves for n disks
        int totalMoves = (1 << n) - 1; // 2^n - 1
        System.out.println(totalMoves);

        // Solve Tower of Hanoi
        solveHanoi(n, 1, 2, 3);

        scanner.close();
    }
}
