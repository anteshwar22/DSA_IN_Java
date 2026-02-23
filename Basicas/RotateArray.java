public class RotateArray {

     public void rotate(int[] nums, int k) {
        while(k=>0)
        {
             for(int i=0;i<nums.length;i++)
             {
                  int cval=arr[i+1];
                  
             }
        }
    }
    public static void main(String[] args) {
         RotateArray ra=new RotateArray();
         int nums[]={1,2,3,4,5,6,7};
         int k=3;
         ra.rotate(nums,k);
         for(int i=0;i<nums.length;i++)
         {
            System.out.print(nums[i]+" ");
         }
    }
}