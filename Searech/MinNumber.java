public class MinNumber {
    public int FindMin(int arr[])
    {    int min=arr[0];
        if(arr.length==0)
        {
            return -1;

        }
        for(int element: arr)
        {  
              if(min>element)
              {
                min=element;
              }
        }

        return min;
    }
    public static void main(String[] args) 
    {
 
        MinNumber mn=new MinNumber();
        int arr[]={10,20,30,5};
        int result = mn.FindMin(arr);
        System.out.println("The Result "+result);
    }  
}
