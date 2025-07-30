package arrays;

public class RemoveDuplicates {
    // here the array is sorted so we are simply using iterative method but if the array was not sorted then we are supposed to use a hashset.
    // Return the size of the array with unique elements

    public static int removeDuplicates(int[] array){
        int idx = 1;
        for (int i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                array[idx++] = array[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        System.out.println("The length of array after removing duplicates is : " + removeDuplicates(array));
    }
}
