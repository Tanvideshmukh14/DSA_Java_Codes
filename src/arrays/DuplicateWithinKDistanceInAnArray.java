package arrays;

public class DuplicateWithinKDistanceInAnArray {
    public static boolean checkDuplicatesWithinK(int[] array, int k){

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j <= k && (i + j) < array.length; j++){
                int c = i + j;

                if (array[i] == array[c]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 4, 3, 5, 6};
        int k = 3;

        System.out.println(checkDuplicatesWithinK(array,k) ? "True" : "False" );
    }
}
