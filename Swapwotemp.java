import java.util.Scanner;
public class Swapwotemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter the first number");
        int b=sc.nextInt();
        System.out.println("Enter the second number");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);


    }
    
}
