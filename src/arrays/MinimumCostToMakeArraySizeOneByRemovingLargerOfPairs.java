package arrays;

public class MinimumCostToMakeArraySizeOneByRemovingLargerOfPairs {
    public static int minCost(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

        return min * (array.length-1);
    }
    public static void main(String[] args) {
        int[] array = { 4, 3, 2 };

        System.out.println("The minimum cost of making the size of array to 1 is : " + minCost(array));
    }
}
