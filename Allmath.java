import java.util.Scanner;

public class Allmath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input first number: ");
        int a=sc.nextInt();
        System.out.println("input second number:");
        int b=sc.nextInt();
        int addition=a+b;
        int multiply=a*b;
        int subtract=a-b;
        int divide=a/b;
        int remainder=a%b;
        System.out.println("addition is :"+addition);
        System.out.println("Subtract is :"+subtract);
        System.out.println("Multiply is: "+multiply);
        System.out.println("Divide is : "+divide);
        System.out.println("Remainder is :"+remainder);
    }
}
