package collection;
import java.util.*;;

public class Solution24 {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        if (str.length()==0) return null;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
          map.put(str.charAt(i), str.length() - str.replace(String.valueOf(str.charAt(i)), "").length());
        }
        return map;
      }
}
