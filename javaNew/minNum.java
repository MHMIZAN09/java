package javaNew;

import java.util.Scanner;

public class minNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int min;
        if (a<b) {
            min=a;
        }else{
            min=b;
        }
        System.out.println("The min number is : "+min);
    }
}
