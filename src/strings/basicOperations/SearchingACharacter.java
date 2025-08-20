package strings.basicOperations;

public class SearchingACharacter {
//    By traversing the string
    public static int findCharacter(String s1, char c){
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

//    By Using in-built library functions
    public static int findCharacterIndex(String s, char c) {
        int idx = s.indexOf(c);
        return (idx != -1) ? idx : -1;
    }

    public static void main(String[] args) {
        String s1 = "HiMyNameIsTanvi";
        char c = 'y';

        System.out.println("By Using in-built library functions : " + findCharacterIndex(s1,c));
        System.out.println("By traversing the string : " + findCharacter(s1,c));
    }
}
