package arrays;

public class SlidingWindow {

    public static int maxSum(int[] array, int window) {
        int currentSum = 0;

        for (int i = 0; i < window; i++){
            currentSum += array[i];
        }

        int max = currentSum;
        for (int i = 1; i <= array.length - window; i++){
            currentSum = currentSum - (array[i-1]) + (array [i + window -1]);
            if (currentSum > max){
                max = currentSum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {3,8,2,5,7,6,12};
        int window = 4;

        System.out.println(maxSum(array,window));
    }
}
