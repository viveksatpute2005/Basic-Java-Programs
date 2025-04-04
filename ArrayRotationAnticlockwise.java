import java.util.Scanner;
public class ArrayRotationAnticlockwise {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        arr=init(size);
        display(arr);
        antirotate(arr);
    }
    public static int[] init(int size){
        int[] t=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the elements");
            t[i]=sc.nextInt();
        }
        return t;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] arr,int start,int end){
        int temp;
        while(start<=end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void antirotate(int[] arr){
        int n=arr.length;
        System.out.println("Enter the D");
        int d=sc.nextInt();
        d=d%n;

        reverse(arr, d, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, 0, n-1);
        display(arr);

    }
}
