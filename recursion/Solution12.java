package recursion;
import java.util.Arrays;

public class Solution12 {
    public int[] reverseArr(int[] arr){
        if (arr.length==0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));
        int[] concate = new int[head.length + tail.length];
        System.arraycopy(head, 0, concate, 0, head.length);  
        System.arraycopy(tail, 0, concate, head.length, tail.length);
        return concate;
        }
}