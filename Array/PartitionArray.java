package Array;
// Java array ko directly print nahi karta. Wo array ka reference (memory address) print karta hai.
import java.util.Arrays;
import java.util.LinkedList;

public class PartitionArray {
    public static void main(String[] args) {
        int [] nums = {9,12,5,10,14,3,10};
        int pivot =10;
        LinkedList<Integer> less = new LinkedList<>();
        LinkedList<Integer> greater = new LinkedList<>();
        LinkedList<Integer> equal = new LinkedList<>();

        for(int num : nums){
            if(num<pivot){
                less.add(num);
            } else if (num>pivot) {
                greater.add(num);

            } else{
                equal.add(num);
            }
        }
        less.addAll(equal);
        less.addAll(greater);


        int i=0;
        int ans [] = new int [nums.length];
        // ans = new int [7]
        for( int num :less){
            ans[i++] =num;  // i++ post increment h
        }
        System.out.println(Arrays.toString(ans));
//     Arrays.toString   Ye array ke har element ko read karta hai aur ek String banata hai.
// Jaise: [9, 5, 3, 10, 10, 12, 14]

        //Java array ko directly print nahi karta. Wo array ka reference (memory address) print karta hai.
        // jaise refrence address = [I@15db9742]

    }
}
