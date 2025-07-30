package arrays;

import java.util.ArrayList;

public class FindMissingAndRepeatingNumbers {
    public static ArrayList<Integer> findMissingAndRepeatingNumbers(int[] array){
        int missingNumber = -1;
        int duplicateNumber = -1;

        int[] frequency = new int[array.length + 1];

        for (int i = 0; i < array.length; i++){
            frequency[array[i]]++;
        }

        for (int i = 1; i <= array.length; i++){
            if (frequency[i] == 0){
                missingNumber = i;
            } else if (frequency[i] == 2) {
                duplicateNumber = i;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(missingNumber);
        arrayList.add(duplicateNumber);

        return arrayList;
    }
    public static void main(String[] args) {
        int[] array = {3, 1, 3};
        System.out.println(findMissingAndRepeatingNumbers(array));
    }
}
