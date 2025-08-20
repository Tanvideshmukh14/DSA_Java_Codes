package strings.basicOperations;

public class InsertCharacter {
    public static StringBuilder insertCharacter(String s1, int position, char c){
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++){
            if (i == position){
                s2.append(c);
            }
        }
        return s2;
    }
    public static void main(String[] args) {

    }
}
