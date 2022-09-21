import java.util.*;

public class Day2 {

    public class Solution {
        public int computeWhenDouble(double interestRate) {
            double principal = 1;
            double interest = 1 + interestRate / 100;
            int year = 0;

            while (principal < 2) {
                principal *= interest;
                year++;
            }
            return year;
        }
    }

}
