package arrays;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] array){

        for (int i = 0; i < array.length -1; i++){
            if (array[i] > array[i + 1]){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println("Is the given array sorted : " + isSorted(array));
    }
}
