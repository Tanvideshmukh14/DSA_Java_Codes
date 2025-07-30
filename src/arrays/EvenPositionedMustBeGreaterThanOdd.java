package arrays;

import java.util.Arrays;

public class EvenPositionedMustBeGreaterThanOdd {
    public static int[] rearrangeArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i != j && array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int[] newArray = new int[n];
        int start = 0;
        int end = n-1;
        for (int i = 0; i < n; i++){

            if ((i + 1) % 2 == 0){
                newArray[i] = array[end--];
            }else {
                newArray[i] = array[start++];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 1};
        System.out.println(Arrays.toString(rearrangeArray(array)));
    }

}
