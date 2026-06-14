package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1 [] = {1,2,3,0,0,0};
       int m=3;
        int nums2 [] = {2,5,6};
        int n =3;

        for(int j=0, i=m; j<n;j++){
            nums1[i] = nums2[j];
            //nums1[3] = nums2[0];
            //nums1[3] = 2
          // then array  [1,2,3,2,0,0]
            i++;
            // then i=4 k liye
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
        //Arrays.toString() array ke har element ko read karke ek string bana deta hai.

    }
}





