package collection;

import java.util.*;

public class Solution23 {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : arr) {
            if (hashMap.containsKey(str))
                map.put(str, hashMap.get(str));
        }
        return map;
    }
}