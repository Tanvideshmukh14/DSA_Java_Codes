package strings;

public class CountWrongCharacters {
    public static void main(String[] args) {
        String input = "ksdjbv83*32rv76RWQ    *&!jlvn";
        int count = countWrongChars(input);
        System.out.println("Number of wrong characters: " + count);
    }

    public static int countWrongChars(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Allowed: letters, digits, and space
            if (!(Character.isLetter(ch) || Character.isDigit(ch) || ch == ' ')) {
                count++;
            }
        }
        return count;
    }
}
