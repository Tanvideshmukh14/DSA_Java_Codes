package arrays;

import java.util.Arrays;

public class RotateAnArrayByDPositions {
    public static int[] rotateArray(int[] array, int d)
    {
        for (int i = 0; i < d; i++){
            int last = array[array.length-1];
            for (int j = array.length-1; j > 0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] array = { 1, 2, 3, 4, 5, 6 };
        int NoOfPositions = 3;

        System.out.println("Array rotated by " + NoOfPositions + " positions : " + Arrays.toString(rotateArray(array,NoOfPositions)));
    }
}
