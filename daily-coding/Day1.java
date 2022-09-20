import java.util.*;

public class Day1 {
	public HashMap<String, String> transformFirstAndLast(String[] arr) {
		HashMap<String, String> map = new HashMap<>();

		if (arr.length == 0)
			return null;
		map.put(arr[0], arr[arr.length - 1]);
		return map;
	}
}
