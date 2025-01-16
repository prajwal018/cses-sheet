package IntroductoryProblems;

import java.util.*;

public class CreatingStrings {
    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        // Generate permutations
        Set<String> permutations = new HashSet<>();
        generatePermutations(input, "", permutations);

        // Convert to a list, sort it, and print
        List<String> sortedPermutations = new ArrayList<>(permutations);
        Collections.sort(sortedPermutations);

        System.out.println(sortedPermutations.size());
        for (String perm : sortedPermutations) {
            System.out.println(perm);
        }
    }

    private static void generatePermutations(String str, String prefix, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(
                        str.substring(0, i) + str.substring(i + 1),
                        prefix + str.charAt(i),
                        permutations
                );
            }
        }
    }
}
