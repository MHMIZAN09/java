package javaNew;

import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.");
        int a=sc.nextInt();
        if (a%2==0) {
            System.out.println("This is the even numbers.");
        }else{
            System.out.println("This is the odd numbers.");
    }
    }
}
