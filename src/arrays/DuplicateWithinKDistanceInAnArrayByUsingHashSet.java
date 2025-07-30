package arrays;

import java.util.HashSet;

public class DuplicateWithinKDistanceInAnArrayByUsingHashSet {
    public static boolean checkDuplicatesWithinK(int[] array, int k) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < array.length; i++)
        {
            if (hashSet.contains(array[i])){
                return true;
            }
            hashSet.add(array[i]);

            if (i >= k){
                hashSet.remove(array[i-k]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6};
        int k = 3;

        System.out.println(checkDuplicatesWithinK(array,k) ? "True" : "False" );
    }
}
