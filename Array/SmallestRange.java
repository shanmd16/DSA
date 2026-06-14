package Array;



public class SmallestRange {
    public static void main(String [] args) {
        int nums [] = {1,3,6};
        int K=3;
        int min = nums[0];
        int max = nums[0];

        for(int X: nums){
            min = Math.min(min,X);
            max= Math.max(max,X);
        }
        System.out.println(Math.max(0,max-min-2*K));
    }
}
