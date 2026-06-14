package Method;
// Recursion means a function call itself is called recursion
public class Recursion {
//    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        // !5 = 5*4*3*2*1
//    }
//
//
//    public static int factorial(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//
//    }
//}
   public static void main(String[] args) {
       System.out.println(sumOfNaturalNumber(6));
   }

public static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumber(n-1);
}
}