package javaNew;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int max,min;
        System.out.println("Enter the number :");
        a=sc.nextInt();
        System.out.println("Enter the the number: ");
        b=sc.nextInt();
        System.out.println("Enter the number: ");
        c=sc.nextInt();
        if (a>b && a>c) {
            System.out.println("the max number is : "+a);
        }else if(b>a && b>c){
            System.out.println("The max number: "+b);
        }else{
            System.out.println("The max number is : "+c);
        }
        System.out.println(" ");
        if (a<b && a<c) {
            System.out.println("the min number is : "+a);
        }else if(b<a && b<c){
            System.out.println("The min number: "+b);
        }else{
            System.out.println("The max number is : "+c);
        }
    }
}
