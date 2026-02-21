public class Merge {
    public static void main(String[] args) {
  // merge two sorted array 
       int original[]={-4,-1,0,1,2,10};
        int arr1[] = new int[];
        int arr2[] = new int[];
        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, count = 0;
         int k=0;
        while(k<original.length)
        {
            if(original[k]<0)
            {
                arr1[]
            }

        }
        while(i<arr1.length&& j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[count]=arr1[i];
                count++;
                i++;

            }
            else{
                 arr3[count]= arr2[j];
                 count++;
                 j++;
            }
        }
          
         while(i<arr1.length)
         {
             arr3[count]=arr1[i];
             count++;
             i++;
         }
         while(j<arr2.length)
         {
            arr3[count]=arr2[j];
            count++;
            j++;
         }
 
        // Print merged array
        for (int k = 0; k < arr3.length; k++) {
            System.out.print(arr3[k] + " ");
        }
    }
}

