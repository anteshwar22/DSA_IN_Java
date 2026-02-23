public class FindInTwoDArray {
      public int[] Search(int arr[][],int target)
      {
         if(arr.length==0)
         {
             return new int[] {-1,-1};
         }
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[i].length;j++)
            {
                 if(arr[i][j]==target)
                 {
                    return  new int[] {i,j};
                 }
            }
        }
        return new int[] {-1,-1};
      }
    public static void main(String[] args) {
        FindInTwoDArray fd=new FindInTwoDArray();
        int arr[][]={
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12}
                    };
        int target=1;
        int[] result =  fd.Search(arr,target);
        System.out.println( " The Row "+result[0] +" The Column "+ result[1]);
    }
}