package arrays.algorithms.Searching;

public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 10, 40 };
        int target = 10;
        System.out.println(binarySearch(array,target));
    }
}
