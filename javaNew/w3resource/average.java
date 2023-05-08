package javaNew.w3resource;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class average {
    public static void main(String[] args) {
        int size, num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        size=sc.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0;i<size;i++){
            
            num=sc.nextInt();
        }
        for(int i=1;i<=size;i++){
            sum+=i;
        }
        System.out.println("the sum is : "+sum);
        int average=sum/size;
        System.out.println("the average is : "+average);
    }
}
