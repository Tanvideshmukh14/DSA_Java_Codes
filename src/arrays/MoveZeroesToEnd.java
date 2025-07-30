package arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public static int[] moveZeroes(int[] array){
        //to keep the count of non-zero elements
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] != 0){
                //swap
               int temp = array[count];
               array[count] = array[i];
               array[i] = temp;

               count++;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 0, 4, 3, 0, 5, 0};

        System.out.println(Arrays.toString(moveZeroes(array)));
    }
}
