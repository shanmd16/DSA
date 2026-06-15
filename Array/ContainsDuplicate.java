package Array;


import java.util.Arrays;
//Given an integer array nums, return true if koi bhi number kam se kam 2 baar aata hai.
//Agar saare numbers alag-alag hain to false return karo.

public class ContainsDuplicate {
    public static boolean containsDuplicate(int [] nums) {

        Arrays.sort(nums);
//        Lekin agar beech mein return true mil gaya, to loop turant ruk jata hai.
//                Isliye kitni baar loop chalega, ye is baat par depend karta hai ki duplicate kis position par milta hai.
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // Duplicate mil gaya
            }
        }
        return false; // Duplicate nhi mila
    }
        public static void main(String[] args) {
            int nums[] = {1, 2, 3, 1};
            System.out.println(containsDuplicate(nums));
    }
}
