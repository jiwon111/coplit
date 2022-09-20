package recursion;

import java.util.*;

public class Solution07 {
    public int arrLength(int[] arr) {
        if (arr.length == 0)
            return 0;
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return 1 + arrLength(tail);
    }
}
