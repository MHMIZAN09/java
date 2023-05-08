package javaNew;

import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        if (a==0) {
            System.out.println("This is zero");
        }else if(a>0){
            System.out.println("This is the positive number.");
        }else{
            System.out.println("This is the negative number.");
        }
    }
}
