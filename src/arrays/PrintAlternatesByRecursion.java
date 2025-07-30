package arrays;

import java.util.ArrayList;

public class PrintAlternatesByRecursion {
    //Alternates with the help of recursion
    public static void alternatesByRecursion(int[] array, int index, ArrayList<Integer> result) {
        //base case
        if (index < array.length) {
            result.add(array[index]);
            //recursive call
            alternatesByRecursion(array, index + 2, result);
        }
    }

    static ArrayList<Integer> getAlternates(int[] array){
        ArrayList<Integer> result = new ArrayList<>();
        alternatesByRecursion(array,0,result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {10,23,1,54,65,77,99};
        ArrayList<Integer> result = getAlternates(array);

        System.out.println("With the help of recursion : " + result);
    }
}
