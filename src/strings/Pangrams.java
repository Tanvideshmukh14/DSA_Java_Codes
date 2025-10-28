package strings;

public class Pangrams {
    public static boolean checkIfPangram(String s1) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            boolean found = false;

            for (int i = 0; i < s1.length(); i++) {
                if (ch == Character.toLowerCase(s1.charAt(i))) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over a lazy dog";
        System.out.println(checkIfPangram(s1) ? "True" : "False");
    }
}
