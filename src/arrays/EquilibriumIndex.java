package arrays;

public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] array){
    int result = 0;
    int prefixSum = 0;
    int suffixSum = 0;
    int total = 0;

    for (int i = 0; i < array.length; i++){
        total += array[i];
    }

    for (int i = 0;i < array.length; i++){
        suffixSum = total - prefixSum - array[i];

        if (prefixSum == suffixSum){
            return i;
        }

        prefixSum += array[i];
    }
    return result;
    }
    public static void main(String[] args) {

        int[] array =  {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("The equilibrium Index is : " + findEquilibriumIndex(array));
    }
}
