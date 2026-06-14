package Array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int [] nums = {2, 3, -2, 4};

       int max = nums[0];
       int min = nums[0];
       int ans = nums[0];

       for(int i=1; i<nums.length; i++){
           int oldMax = nums[0];
           max = Math.max(nums[i],
                   Math.max(max*nums[i], min*nums[i]));

           min = Math.min(nums[i],
                   Math.min(oldMax*nums[i], min*nums[i]));
           ans = Math.max(ans,max);
       }
        System.out.println(ans);



       }
    }