package javaNew;

import java.util.Scanner;

public class maxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number; ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int max;
        if (a>b) {
             max=a;
        }
        else{
           max=b;
        }
        System.out.println("the max number is:"+max);
    }
}
