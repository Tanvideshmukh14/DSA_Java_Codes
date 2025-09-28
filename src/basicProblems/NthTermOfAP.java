package basicProblems;

public class NthTermOfAP {
    public static int nthTerm(int a1,int a2,int n) {
         //formula
        return (a1 + (n-1) * (a2-a1));
    }

    public static void main(String[] args) {
        int a1 = 2, a2 = 3;
        int n = 4;
        System.out.println(nthTerm(a1,a2,n));
    }
}
