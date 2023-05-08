import java.util.Scanner;

public class test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num;i++){
            
            if(i%2==0){
                System.out.println("Even");
                System.out.println(i);
            }else if(i%2==1){
                System.out.println("odd");
                System.out.println(i);
            }
            if(i==0){
                System.out.println("zero");
            }
        }
    }
}
