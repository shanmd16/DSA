package Binary;

public class SumOfTwoIntegrs {
//    public static void  main(String[] args) {
//        int a=1;
//        int b = 2;
//        while(b!=0){
//            int carry = (a&b) <<1;
//            a = a^b;
//             b = carry;
//        }
//        System.out.println(a);
//    }
//}

public static void main(String[] args) {

    System.out.println(SumTwoIntegrs(2,3));


}

public static int SumTwoIntegrs(int a,int b) {
    while (b != 0) {
        int carry = (a & b) << 1;
        a = a ^ b;
        b = carry;
    }
    return a;
}

}