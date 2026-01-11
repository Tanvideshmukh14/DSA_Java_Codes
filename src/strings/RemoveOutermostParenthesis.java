package strings;

public class RemoveOutermostParenthesis {
        public static String removeOuterParentheses(String s) {
            int depth = 0;
            StringBuilder sb =  new StringBuilder();
            for(char c : s.toCharArray()){

                if(c == '('){
                    if(depth > 0){
                        sb.append(c);
                    }
                    depth++;
                }else if(c == ')'){
                    depth--;
                    if(depth > 0){
                        sb.append(c);
                    }
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
