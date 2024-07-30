import java.util.Scanner;
public class Swapping{
    
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("a=" + a);
        System.out.println("b="+b);


    }
}
