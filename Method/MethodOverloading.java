package Method;

// Method overloadind means same method name but different parameter

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(23,23));
        System.out.println(sum(10,15,25));
    }
    private static int sum(int a, int b){
        return a+b;
    }

    private static int sum(int a, int b, int c){
        return a+b+c;
    }
}
