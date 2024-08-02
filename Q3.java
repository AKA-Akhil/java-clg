package javaLab;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();
        int[] originalArray = new int[N];
        int[] ascendingArray = new int[N];
        int[] descendingArray = new int[N];

       
        System.out.println("Enter the elements:");
        for (int i = 0; i < N; i++) {
            originalArray[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < N; i++) {
            ascendingArray[i] = originalArray[i];
            descendingArray[i] = originalArray[i];
        }

        
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (ascendingArray[i] > ascendingArray[j]) {
                    int temp = ascendingArray[i];
                    ascendingArray[i] = ascendingArray[j];
                    ascendingArray[j] = temp;
                }
            }
        }

       
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (descendingArray[i] < descendingArray[j]) {
                    int temp = descendingArray[i];
                    descendingArray[i] = descendingArray[j];
                    descendingArray[j] = temp;
                }
            }
        }


        System.out.println("Array in ascending order:");
        for (int num : ascendingArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array in descending order:");
        for (int num : descendingArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
