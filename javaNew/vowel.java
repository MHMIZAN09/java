import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=0;
        System.out.println("Enter the char: ");
        ch=sc.next().charAt(ch);
        switch(ch){
            case 'A':
            case 'a':
            System.out.println("vowel");
            break;
            case 'E':
            case 'e':
            System.out.println("vowel");
            break;
            case 'I':
            case 'i':
            System.out.println("vowel");
            break;
            case 'O':
            case 'o':
            System.out.println("vowel");
            break;
            case 'U':
            case 'u':
            System.out.println("vowel");
            break;
            default:
            System.out.println("consonets.");
        }

    }
}
