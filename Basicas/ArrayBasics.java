package Basicas;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {
        
        int [] arr=new int[4];
         
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<arr.length ;i++){
          arr[i]=sc.nextInt();
       }
       System.out.println("Output is : ");
    //    for(int i=0;i<arr.length;i++)
    //    {
    //      System.out.print(arr[i]+",");
    //    }
    for(num:arr)
    {
        System.out.print(num+" ");
    }
    }
} 