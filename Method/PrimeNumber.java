package Method;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(91));
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(75));





    }
    public static boolean primeNumber(int x){
        int res =0;
        for(int i=1; i<x/2; i++){
            if(x%i == 0){
                res++;

            }
        }
        return res ==1;
    }
}
