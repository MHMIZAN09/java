package javaNew;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Enter the again number:");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum :"+sum);
    }
}
