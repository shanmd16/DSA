package Array;

public class ContainerWithMostWater {
//    public static void main(String[] args) {
//
//
//        int [] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int left = 0;
//        int right = height.length - 1;
//        int maxArea = 0;
//
//        while(left < right) {
//            maxArea = Math.max(maxArea,(right-left)*Math.min(height[left],height[right]));
//            if(height[left]<height[right]){
//                left++;
//            } else{
//                right--;
//
//            }
//
//        }
//        System.out.println(maxArea);
//    }
//}

//used function / Method
public static void main(String[] args) {
    int [] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(FindmaxArea(height));
}

  public static int FindmaxArea(int[] height){
      int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            maxArea = Math.max(maxArea,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            } else{
                right--;

            }

        }
        return maxArea;

  }

}