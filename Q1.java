	package javaLab;
	import java.util.Scanner;
	
	public class Q1 {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int c = 0;
	        System.out.println("Enter the no. of elements");
	        int n = in.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter the elements");
	        for (int i = 0; i < n; i++) {
	            a[i] = in.nextInt();
	        }	
	        
	        System.out.println("Enter No. to search");
	        int j = in.nextInt();
	        boolean found = false; // To check if the number is found
	        
	        for (int i = 0; i < n; i++) {
	            if (a[i] == j) {
	                System.out.println("No. found at index: " + i);
	                found = true;
	                c++;
	            }
	        }
	        
	        if (!found) {
	            System.out.println("No. not found");
	        } else {
	            System.out.println("No. of " + j + "s: " + c);
	        }
	    }
	}
