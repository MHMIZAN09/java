import java.util.Scanner;

import javaNew.Area;

public class circleDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double radius;
        System.out.print("Enter the radius: ");
        radius=sc.nextDouble();
        double Area= 3.1416*radius*radius;
        System.out.print("Area of circle: ");
        System.out.print(Area);
    }
}
