import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cels;
        System.out.print("Enter the celsius: ");
        cels=sc.nextDouble();

        double f=1.8*(cels+32);
        System.out.print("Enter the f temp: ");
        System.out.println("The celsius is : "+f)
    }
}
