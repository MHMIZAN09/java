import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input first number: ");
        int a=sc.nextInt();
        System.out.println("input second number: ");
        int b=sc.nextInt();
        int mul=a*b;
        System.out.println("The product is "+mul);;
    }
}
