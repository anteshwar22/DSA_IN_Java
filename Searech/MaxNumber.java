public class MaxNumber {
    public int FindMin(int arr[])
    {    int max=arr[0];
        if(arr.length==0)
        {
            return -1;

        }
        for(int element: arr)
        {  
              if(max<element)
              {
                max=element;
              }
        }

        return max;
    }
    public static void main(String[] args) 
    {
 
        MaxNumber mn=new MaxNumber();
        int arr[]={10,20,30,5};
        int result = mn.FindMin(arr);
        System.out.println("The Result "+result);
    }  
}
