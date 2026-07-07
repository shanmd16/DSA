package Binary;

public class CountingBits {
    public static void  main(String[] args) {
        int n=2;
        int [] ans = new int [n+1];

        for(int i=1;i<=n;i++){
            ans[i]= ans[i>>1] + (i&1);
        }
        System.out.println(ans);
    }
}
//class Solution {
//    public int[] countBits(int n) {
//
//        int [] ans = new int [n+1];
//
//        for(int i=1;i<=n;i++){
//            ans[i]= ans[i>>1] + (i&1);
//        }
//        return ans;
//    }
//}