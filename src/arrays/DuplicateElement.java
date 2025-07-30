package arrays;

public class DuplicateElement {
    public static int findDuplicateElement(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++){

            if (array[Math.abs(array[i])] < 0){
                return Math.abs(array[i]);
            }
            array[Math.abs(array[i])] = -array[Math.abs(array[i])];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4};
        System.out.println(findDuplicateElement(array));
    }
}
