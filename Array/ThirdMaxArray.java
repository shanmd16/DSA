package Array;

import java.util.Arrays;

public class ThirdMaxArray {
    public static void main(String[] args) {
        int nums [] = {1,2,2,3};
        Arrays.sort(nums);
        int n = nums.length, cnt =1;
        for(int i=n-1; i>=1; i--) {
            if (nums[i] != nums[i - 1])
                cnt++;
            if (cnt == 3) {
                System.out.println(nums[i - 1]);
                return;
            }
        }

            System.out.println(nums[n-1]);
        }
    }






