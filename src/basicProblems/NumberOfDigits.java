package basicProblems;

public class NumberOfDigits {
    public static int calculateNumberOfDigits(int num){
        int digits = 0;
        while(num > 0){
            num = num/10;
            digits++;
        }
        return digits;
    }
    public static void main(String[] args) {
        int num = 123472;
        System.out.println(calculateNumberOfDigits(num));
    }
}
