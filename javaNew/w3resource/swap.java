package javaNew.w3resource;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,temp;
        System.out.println("Enter the numbers 1; ");
        num1=sc.nextInt();
        System.out.println("Enter the second numbers");
        num2=sc.nextInt();
        System.out.println("numbers 1 is:"+num1);
        System.out.println("number 2 is :"+num2);
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("after swap the numbers is");
        System.out.println(num1);
        System.out.println(num2);
    }
}
