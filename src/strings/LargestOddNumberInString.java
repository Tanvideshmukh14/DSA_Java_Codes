package strings;

public class LargestOddNumberInString {
    public static String largestOddNumber(String s) {
        int index = -1;
        for(int i = s.length() -1; i>= 0 ; i--){
            if((s.charAt(i) - '0') %2 != 0){
                index = i;
                break;
            }
        }
        if(index == -1) return "";

        return s.substring(0,index+1);

    }

    public static void main(String[] args) {
        String s = "52";
        System.out.println(largestOddNumber(s));
    }
}
