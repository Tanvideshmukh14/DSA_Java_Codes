package stacks;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static String reverseString(String s) {
        Stack st = new Stack();
        String result = "";
        for(char c : s.toCharArray()){
            st.push(c);
        }
        while(!st.isEmpty()){
            result += st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "Tanvi";
        System.out.println(reverseString(s));
    }
}
