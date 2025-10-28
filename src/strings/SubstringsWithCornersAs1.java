package strings;

public class SubstringsWithCornersAs1 {
    public static int countValidSubstring(String s1) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == '1'){
                count++;
            }
        }
        return (count * (count - 1))/2;
    }
    public static void main(String[] args) {
        String s1 = "00100101";
        System.out.println("Result : " + countValidSubstring(s1));
    }
}
