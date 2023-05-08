package javaNew.w3resource;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double r,area,perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius : ");
        r=sc.nextDouble();
        area=Math.PI*r*r;
        perimeter=2*Math.PI*r;
        System.out.println("area is ; "+area);
        System.out.println("preimeter is ; "+perimeter);
        

    }
}
