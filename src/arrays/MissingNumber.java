package arrays;

public class MissingNumber {
    public static int findMissingNumber(int[] array){
        int totalNumbers = 0;
        int totalNumbersInArray = 0;

        for (int i = 0; i < array.length; i++){
            totalNumbersInArray ^= array[i];
        }

        for (int i = 1; i <= array.length + 1 ; i++){
            totalNumbers ^= i;
        }

        return totalNumbers ^ totalNumbersInArray;
    }
    public static void main(String[] args) {
        int[] array = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(findMissingNumber(array));
    }
}
