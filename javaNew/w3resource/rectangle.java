package javaNew.w3resource;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double width,height,area,perimeter;
        System.out.println("Enter the width: ");
        width=sc.nextDouble();
        System.out.println("Enter the height: ");
        height=sc.nextDouble();
        area=width*height;
        perimeter=2*(width+height);
        System.out.println("the area is : "+area);
        System.out.println("the perimeter is :"+perimeter);
    }
}
