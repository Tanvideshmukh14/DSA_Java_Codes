package strings.basicOperations;

import java.util.Objects;

public class CheckIfSameOrNot {
    public static boolean isSame(String s1,String s2){
        if (s1.equals(s2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(isSame(s1,s2));
    }
}
