package arrays;

public class MaxElement {
    public static int findMax(int[] array){
        int result = 0;

        for (int i = 0; i < array.length; i++){
            if (result < array[i]){
                result = array[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array = {1,4,6,8,99,101};
        System.out.println(findMax(array));
    }

}
