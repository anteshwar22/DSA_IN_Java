class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
         Arrays.sort(nums);
             int n=nums.length;
        //find 2 sum for every i element 
        for(int i=0;i<n-2;i++)
        { 
            int left=i+1;
            int right=n-1;
            int target= -1*nums[i];

            while(left<right)
            {   int sum = nums[left]+nums[right];
               if(sum==target)
               {  
                                                
               }
               else if(sum<target)
               {
                left++;
               }
               else
               {
                right--;
               }
            }
            
        }
    }
}