package javaLab;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int i,j;
        System.out.println("Enter the no.s in 3x3 matrix");
        for(i=0;i<3;i++) {
        	for(j=0;j<3;j++) {
        		a[i][j]= in.nextInt();
        	}
        }
        System.out.println("Entered Matrix:\n");
        for(i=0;i<3;i++) {
        	for(j=0;j<3;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
        
        System.out.println("Transposed Matrix:\n");
        for(i=0;i<3;i++) {
        	for(j=0;j<3;j++) {
        		b[i][j] = a[j][i];
        		System.out.print(b[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
