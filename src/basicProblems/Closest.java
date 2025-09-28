package basicProblems;

public class Closest {
    public static int findClosest(int n, int m){
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;

        for(int i = n-Math.abs(m);i <= n+Math.abs(m);i++){
            if(i % m == 0) {
                int difference = Math.abs(n - i);

                if (difference < minDifference || (Math.abs(i) > Math.abs(closest) && difference == minDifference)){
                    closest = i;
                    minDifference = difference;
                }
            }
        }
        return closest;
    }
    public static void main(String[] args){
        int n = 13;
        int m = 4;
        System.out.println("The result is : " + findClosest(n,m) );
    }
}

