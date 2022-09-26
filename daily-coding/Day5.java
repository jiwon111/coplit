public class Day5 {
    public static void main(String[] args) {
        String result = firstReverse("abcdefg");
        System.out.println(result);
    }

    public static String firstReverse(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(str.length() - i - 1);
        }
        return reverse;
    }
}
