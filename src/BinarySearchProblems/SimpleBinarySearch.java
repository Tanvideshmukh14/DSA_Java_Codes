package BinarySearchProblems;

public class SimpleBinarySearch {
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length-1;

      while(low <= high){
            int mid = low + (high - low) / 2;

            if (array[mid] == target){
                return mid;
            }
            if (array[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,3,5,8,20};
        int target = 8;

        System.out.println("Element was found at : " + binarySearch(array,target));
    }
}
