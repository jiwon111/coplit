import java.util.HashMap;

public class Day7 {
    public static void main(String[] args) {

        String[][] arr = {
                { "make", "Ford" },
                { "model", "Mustang" },
                { "year", "1964" },
                { "make", "Bill" }
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output);
    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> result = new HashMap<String, String>();
        for (int i = 0; arr.length > i; i++) {
            if (arr[i].length == 2 && !result.containsKey(arr[i][0])) {
                result.put(arr[i][0], arr[i][1]);
            }
        }
        return result;
    }
}
