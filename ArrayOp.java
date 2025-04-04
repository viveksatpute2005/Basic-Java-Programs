import java.util.Scanner;
public class ArrayOp {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size");
        int size=sc.nextInt();

        int[] arr=new int[size];
        arr=init(size);
        display(arr);
       sum(arr);
       reverse(arr);
       max(arr);
       min(arr);
       smax(arr);
    }
    public static int[] init(int size){
        int[] t=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element");
            t[i]=sc.nextInt();
        }

        return t;
    }
    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum"+sum);
    }
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
     display(arr);
       
    }
    public static void max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        System.out.println("max="+max);
    }
    public static void min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min="+min);
    }
    public static void smax(int[] arr){

        int max=Integer.MIN_VALUE;
        int smax;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
            }
        }
        System.out.println(smax);
    }
}
