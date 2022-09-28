public class Day6 {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("abcDEff bb cd Ed ff"));
    }

    public static String letterCapitalize(String str) {
        String result = "";
        if (str.length() == 0)
            return "";
        // if ()
        result += String.valueOf(str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                result += String.valueOf(str.charAt(i)).toUpperCase();
            } else
                result += String.valueOf(str.charAt(i));
        }

        return result;
    }
}
