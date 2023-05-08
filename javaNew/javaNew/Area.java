package javaNew;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double base,height,area;
        System.out.print("Enter the Base: ");
        base=sc.nextDouble();
        System.out.print("Enter the height: ");
        height=sc.nextDouble();
        area=0.5*base*height;
        System.out.print("Area is : ");
        System.out.print(area);
    }
}
