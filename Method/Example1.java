package Method;
// Method is a block of code that perform a  specific task and can be reused. Write once used often
//Method Syntax
// AccessModifire returnType methodName(parameter){
          //methodBody
//}



public class Example1 {

 //  public static void main(String[] args) {
//        sumOfArray();
//        sumOfArray();
//    }
//    // method declaration
//    public static void sumOfArray(){
//        int [] arr = {1,2,3,4};
//        int res=0;
//        for(int i: arr) {
//            res = res + i;
//        }
//        System.out.println(res);
//    }
//}




//      public static void main(String[] args){
//          int [] a={2,3,3,4,5,6};
//             sumOfArray(a);
//          int [] b={2,3,3,4,5,16};
//          sumOfArray(b);
//
//      }
//
//      // parameterized method
//      public static void sumOfArray(int[] arr){
//          int res =0;
//          for(int i: arr) {
//              res += i;
//          }
//              System.out.println(res);
//          }
//      }


// String Method

    public static void main(String[] args) {
        String res = upperFun("  Shan ");
        System.out.println(res);

    }



private static String upperFun(String str){
    return str.trim().toUpperCase();

}
}



