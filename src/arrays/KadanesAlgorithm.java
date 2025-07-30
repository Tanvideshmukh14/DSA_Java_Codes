package arrays;

public class KadanesAlgorithm {
    public static int largestSumOfContiguousArray(int[] array){
        int result = 0;
        int maxSum = 0;

        for (int i = 0; i < array.length; i++)
        {
            maxSum = Math.max(maxSum + array[i], array[i]);

            result = Math.max(result,maxSum);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] array = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(largestSumOfContiguousArray(array));
    }
}
