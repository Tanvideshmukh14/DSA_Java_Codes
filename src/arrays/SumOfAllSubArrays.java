package arrays;

public class SumOfAllSubArrays {
    public static int calculateSumOfSubArrays(int[] array){
        int result = 0;

        for (int i = 0; i < array.length; i++){
            result += (array[i] * (i+1) * (array.length - i));
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 3, 2};
        System.out.println(calculateSumOfSubArrays(array));
    }
}
