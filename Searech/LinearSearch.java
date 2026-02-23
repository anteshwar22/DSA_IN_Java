 import java.util.*;
public class LinearSearch 
{
    public int search(int arr[],int target)
      {
            if(arr.length==0)
                {
                    return -1;
                }

            for(int index=0;index<arr.length;index++)
                {
                    if(arr[index]==target)
                    {
                        return index;
                    }
                }
                return -1;
       }
    public static void main(String[] args) 
    {
        
        LinearSearch ls=new LinearSearch();

        int arr[]={1,2,3,4,5,6,7,8,9};

        int k=1;
        int result= ls.search(arr,k);
        System.out.println(result);
    }     
}     