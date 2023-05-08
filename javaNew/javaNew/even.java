package javaNew;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num;
        num=sc.nextInt();
        for(int i=0;i<=num;i++){
            if (i%2==0) {
                System.out.println("the Even number is: "+i);
            }
            /*else{
                System.out.println("The odd number is : "+i);
            }*/
        }
    }
}
