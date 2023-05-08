package javaNew;

import java.util.Scanner;

public class compareing {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name=sc.nextLine();
        System.out.println("Enter the second name : ");
        String name1=sc.nextLine();

        /*if (name.equals(name1)) {
            System.out.println("The name is same .");
        }else{
            System.out.println("The name is not same.");
        }*/
        if (name.compareTo(name1)==0) {
            System.out.println("");
        }
    }
}
