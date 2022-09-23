public class Day4 {
    public static void main(String args[]) {
        firstCharacter("abcd w d d fgggg");
    }

    public static String firstCharacter(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((i > 0 && str.charAt(i - 1) == ' ') || i == 0) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}