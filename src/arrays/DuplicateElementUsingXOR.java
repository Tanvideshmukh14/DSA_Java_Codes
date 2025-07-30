package arrays;

public class DuplicateElementUsingXOR {
    public static int findDuplicateElement(int[] array){
        int result = 0;

        for (int i = 0; i < array.length-1; i++){
            result ^= (i + 1) ^ array[i];
        }

        result ^= array[array.length-1];

        return result;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4};
        System.out.println(findDuplicateElement(array));
    }
}
