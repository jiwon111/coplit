package recursion;
import java.util.Arrays;

public class Solution10 {
    public boolean and(boolean[] arr){
        if (arr.length==0) return true;
        if (arr.length==1) return arr[0];
        boolean compare = arr[0];
        if (compare==false||arr[1]==false) return false;
        return and(Arrays.copyOfRange(arr, 1, arr.length));
        } 
}
