package strings;

import java.util.Arrays;

public class ValidAnagram {
    public static Boolean checkIfValidAnagram(String s1, String s2) {

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1,array2);
    }
    public static void main(String[] args) {
        String s = "racecar", t = "carrace";

        System.out.println("Are these two strings valid Anagrams : " + checkIfValidAnagram(s,t));
    }
}
