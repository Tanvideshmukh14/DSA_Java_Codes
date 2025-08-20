package strings;

public class CheckForBinary {
    public static boolean isBinary(String string){

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) != '0' && string.charAt(i) != '1'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String string = "10000001";
        System.out.println(isBinary(string));
    }
}
