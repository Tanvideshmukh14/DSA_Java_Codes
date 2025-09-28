package basicProblems;

public class DiceProblem {
    public static int oppositeFaceOfDice(int n){
        int ans = 7-n;
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("This opposite face on the dice is : " + oppositeFaceOfDice(n));
    }
}
