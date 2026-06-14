package Array;

public class PartitionArray2 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
//        {1,2};
//        {3,4};
//        {5,6};
//        index 0,2,4 par min element 1,3,5 jiska sum =9
        // nums ko 2 part mai divide karna fir minimum element ka find kar k plus karna h

        int res=0;

        for(int i=0;i<nums.length;i=i+2){
            res = res+nums[i];

        }
        System.out.println(res);
    }
}
