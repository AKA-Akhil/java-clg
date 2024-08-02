package javaLab;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        System.out.println("URK23CS1028");
        int limit;
        System.out.println("Enter the limit of both arrays");
        Scanner sr=new Scanner(System.in);
        limit=sr.nextInt();
        int ar[]=new int[limit];
        int ar1[]=new int[limit];
        System.out.println("Enter the elements of first array");
        for(int i=0;i<limit;i++) {
            ar[i]=sr.nextInt();}
        System.out.println("Enter the elements of second array");
        for(int i=0;i<limit;i++) {
            ar1[i]=sr.nextInt();
        }
        for(int i=0;i<limit;i++) {
            for(int j=0;j<limit;j++) {
                if(ar[i]==ar1[j]) {
                    System.out.println("The common element in array:"+ar[i]);}
                }
            }
        }
    }