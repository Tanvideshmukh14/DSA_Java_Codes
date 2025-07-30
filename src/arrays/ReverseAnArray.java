package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    //two pointers technique
    public static int[] reverseArray(int[] array){
        int left = 0;
        int right = array.length - 1;

        while(right > left){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 2, 6, 5};
        System.out.println("Reversed array : " + Arrays.toString(reverseArray(array)));
    }
}
