import java.util.Scanner;
public class ArrayRotation {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size");
        int size=sc.nextInt();

        int[] arr=new int[size];
        arr=init(size);
        display(arr);
        
        rotate(arr);
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
            System.out.print(" "+arr[i]);
        }
    }
    public static void reverse(int[] arr,int start,int end){
       
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
     

    }
    public static void rotate(int[]arr){
        int n=arr.length;
        System.out.println("Enter the value of D");
        int d=sc.nextInt();
        d=d%n;


        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        // int i=0;
        // int j=d-1;
        // int temp;
        // while(i<=j){
        //     temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }

        
        // int l=d;
        // int m=n-1;
        // while(l<=m){
        //     temp=arr[l];
        //     arr[l]=arr[m];
        //     arr[m]=temp;
        //     l++;
        //     m--;
        // }
        display(arr);
    }

}
