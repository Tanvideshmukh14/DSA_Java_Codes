package arrays;

import java.util.ArrayList;

public class PrintAlternates {
    public static ArrayList<Integer> getAlternates(int[] array){
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2){
            result.add(array[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,55,64,24,28,82,100};

        System.out.println("Printing alternates by iteration : " + getAlternates(array));
    }
}
