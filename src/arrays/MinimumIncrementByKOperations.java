package arrays;

import java.util.Arrays;

public class MinimumIncrementByKOperations {
    public static int minOperations(int[] array,int k){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            max = Math.max(max,array[i]);
        }
        int result = 0;

        for (int i = 0; i < array.length; i++){
            if ((max - array[i]) % k != 0){
                return -1;
            }else {
                result += ((max - array[i]) / k);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = { 21, 33, 9, 45, 63 };
        int k = 6;
        System.out.println(minOperations(array,k));
    }
}
