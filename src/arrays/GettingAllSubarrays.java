package arrays;

public class GettingAllSubarrays {
    public static void printAllTheSubarrays(int[] array){
        //for getting the starting index
        for (int i = 0; i < array.length; i++){
            //for getting the ending address
            for (int j = i; j < array.length; j++){
                //for printing the subarrays
                for (int k = i; k <= j; k++){
                    System.out.print(array[k]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printAllTheSubarrays(array);
    }
}
