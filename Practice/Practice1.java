package Practice;

//public class Practice1 {
//    public static void main(String[] args) {
//
//        char arr[] = {'D', 'E', 'L', 'H', 'I'};
//
//        int i = 0;
//
//        int j = arr.length - 1;
//
//
//        while (i <= j) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//
//            i++;
//            j--;
//        }

//        System.out.println(arr);
//
//
//    }
//}

class Practice2 {
    public static void main (String [] args){
    int arr [] = {5,7,2,9};

    int target = 9;

    for(int i=0; i<=arr.length-1; i++){
        for(int j=i+1;j<=arr.length-1; j++) {
            if (arr[i]+arr[j] == target) {
                System.out.println("Index:" + " " + i + " " +j);
            }
        }

        }
    }

}

