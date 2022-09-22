import java.util.*;

public class Day3 {
    public boolean powerOfTwo(long num) {
        long power = 2;
        if (num==1) return true;
        if (num%2==1) return false;
        while(power<num){
            power*=2;
        }
        return power == num;
    }
}

