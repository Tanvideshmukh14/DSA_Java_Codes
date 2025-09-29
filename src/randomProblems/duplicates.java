package randomProblems;

import java.util.ArrayList;

public class duplicates {
    public static ArrayList<Integer> findDuplicates(int[] array){
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j< array.length; j++){
                if (array[i] == array[j]){
                    if (!duplicates.contains(array[i])) {
                        duplicates.add(array[i]);
                    }
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] array = {1,4,5,6,5,4,5};
        System.out.println(findDuplicates(array));

    }
}
