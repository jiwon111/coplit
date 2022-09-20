package recursion;
import java.util.*;

public class Solution09 {
    ArrayList<Integer> list = new ArrayList<>();
    int cnt=0;

	public int[] take(int num, int[] arr){
    if (arr.length==0) return new int[]{};
    if (num>arr.length) return arr;
    if (num==0) return list.stream().mapToInt(i->i).toArray();

    list.add(cnt, arr[0]);
    cnt++;
    return take(num-1, Arrays.copyOfRange(arr, 1, arr.length));
	} 
}
