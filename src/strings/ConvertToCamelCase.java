package strings;

public class ConvertToCamelCase {
    public static String toCamelCase(String string){
        boolean Capitalize = false;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == ' ')
            {
                Capitalize = true;
            }
            else if (Capitalize)
            {
                result.append(Character.toUpperCase(string.charAt(i)));
                Capitalize = false;
            }
            else
            {
                result.append(string.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String string = "hi i am tanvi deshmukh";
        System.out.println(toCamelCase(string));

    }
}
