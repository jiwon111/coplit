public class Day9 {
    public boolean ABCheck(String str) {
        if (str.length() == 0)
            return false;
        for (int i = 0; (i + 4) < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                if (str.charAt(i + 4) == 'b' || str.charAt(i + 4) == 'B')
                    return true;
            }
            if (str.charAt(i) == 'b' || str.charAt(i) == 'B') {
                if (str.charAt(i + 4) == 'a' || str.charAt(i + 4) == 'A')
                    return true;
            }
        }
        return false;
    }
}
