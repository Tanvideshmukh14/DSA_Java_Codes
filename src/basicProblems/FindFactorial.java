package basicProblems;

import java.util.Scanner;

public class FindFactorial {

    public static int calculateFactorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int num;

        Scanner Input = new Scanner(System.in);
        num = Input.nextInt();

        System.out.println(calculateFactorial(num));
    }
}
