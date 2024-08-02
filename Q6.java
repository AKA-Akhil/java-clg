package javaLab;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = scanner.nextLine();
        scanner.close();

        char result = findFirstNonRepeatedCharacter(input.toCharArray());
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedCharacter(char[] input) {
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Counting occurrences of each character
        for (char c : input) {
            charCount[c]++;
        }

        // Finding the first non-repeated character
        for (char c : input) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0'; // Return a null character if no non-repeated character is found
    }
}
