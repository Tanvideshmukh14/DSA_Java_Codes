package arrays.algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {7,8,3,1,2};

        //Bubble sort
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length-i-1; j++){

                if (array[j] > array[j+1]){
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
