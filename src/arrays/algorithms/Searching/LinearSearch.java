package arrays.algorithms.Searching;

public class LinearSearch {
    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 10, 40};
        int target = 10;

        System.out.println(linearSearch(array,target));
    }
}
