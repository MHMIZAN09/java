import java.util.Scanner;

public class Multiplicaton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number;" );
        int n=sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(n + "X" +(i+1) + "="+(n*(i+1)));
        }
    }
}
