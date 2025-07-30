package arrays;

import java.util.ArrayList;

public class SortedSubSequence {
    public static ArrayList<Integer> findSortedSubsequence(int[] array){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i < array.length - 1; i++){
            if (array[i-1] < array[i] &&  array[i] < array[i+1]){
                arrayList.add(array[i+1]);
                arrayList.add(array[i]);
                arrayList.add(array[i-1]);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        int[] array = {12, 11, 10, 5, 6, 2, 30};
        System.out.println(findSortedSubsequence(array));
    }
}
