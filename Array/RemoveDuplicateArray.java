package Array;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int  nums [] = {1,1,2};

        if(nums.length == 0){
            System.out.println(0);
            return;
        }
        int i=0;
        for(int j=1;j<nums.length;j++){
           if (nums[j]!= nums[i]){
               i=i+1;
               nums[i]=nums[j];
           }
        }
        System.out.println(i+1);



    }
}
