package arrays;

public class SplitArrayIntoThreeEquals {
    public static int[] splitArrayIntoThreeEquals(int[] array){
        int totalSum = 0;
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++){
            totalSum += array[i];
        }

        int currentSum = 0;
        int j = 0;


        if (totalSum % 3 != 0){
            result[j] = -1;
            result[j+1] = -1;
            return result;
        }

        int target = array.length / 3;

        for (int i = 0; i < array.length; i++){
            currentSum += array[i];

            if (currentSum == target){
                currentSum = 0;
                result[j] = i;
                j++;
            }
            i++;


        }
    return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 0, 4};
    }
}
