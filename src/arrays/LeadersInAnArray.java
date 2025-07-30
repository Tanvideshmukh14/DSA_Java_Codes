package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    //An element is a Leader if it is greater than or equal to all the elements to its right side.

    public static ArrayList<Integer> getLeaders(int[] array){
        ArrayList<Integer> leaderArray = new ArrayList<>();
        int n = array.length;
        int max = array[n-1];
        leaderArray.add(max);

        for (int i = n-2; i >=0; i--){
            if (array[i] >= max) {
                max = array[i];
                leaderArray.add(max);
            }
        }
        //Reversing Array
        Collections.reverse(leaderArray);
        return leaderArray;
    }
    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        System.out.println("The Leaders in this array are : " + getLeaders(array));
    }
}
