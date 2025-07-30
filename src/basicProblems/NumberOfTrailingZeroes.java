package basicProblems;

public class NumberOfTrailingZeroes {

    public static int calculateTrailingZeroes(int num) {
        if (num == 0) return 1; 

        int count = 0;
        while (num % 10 == 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 80060000;
        System.out.println("Trailing zeroes: " + calculateTrailingZeroes(num));
    }
}
