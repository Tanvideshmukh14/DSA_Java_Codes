package arrays;

public class UniqueNumber {
    public static int findUniqueNumber(int[] array){
        int uniqueNumber = 0;

        for (int i = 0; i < array.length; i++){
            uniqueNumber ^= array[i];
        }

        return uniqueNumber;
    }
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findUniqueNumber(array));
    }
}
