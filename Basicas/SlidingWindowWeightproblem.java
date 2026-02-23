import java.util.HashMap;
 class SlidingWindowWeightproblem {

   public int SearchWindow(int[] nums)
   {
     int low=0;
     int sum=0;
     int res=0;
     HashMap<Integer,Integer>f=new HashMap<>();
     for(int high=0;high<nums.length;high++)
     {  int h=nums[high];
        f.put(h, f.getOrDefault(h,0)+1);
        sum+=nums[high];
        while (sum>100) {
            int l=nums[low];
         f.put(l,f.getOrDefault(l,0)-1);
        if(f.get(l)==0)
        {
            f.remove(l);
        }
        sum-=nums[low];
        low++;
        }
        int  len=high-low+1;
         res= Math.max(res,len);
     }
     return res;     
   }

    public static void main(String[] args) {
         SlidingWindowWeightproblem cp= new SlidingWindowWeightproblem();
         int nums[]={10,50,40,80,2,10,8};
       int result=  cp.SearchWindow(nums);
       System.out.println(result);
    }
}