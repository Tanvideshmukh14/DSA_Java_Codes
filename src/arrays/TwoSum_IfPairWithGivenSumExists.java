package arrays;

import java.util.HashSet;

public class TwoSum_IfPairWithGivenSumExists {
    public static boolean checkIfPairWithGivenSumExists(int[] array, int sum){
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++){
            int complement = sum - array[i];

            if (hashSet.contains(complement)){
                return true;
            }

            hashSet.add(array[i]);
        }

        return false;
    }
    public static void main(String[] args) {
        int[] array = { 0, -1, 2, -3, 1 };
        int target = -2;

        System.out.println("Does a Pair With the Given Sum Exists in the array : " + checkIfPairWithGivenSumExists(array,target));
    }
}
