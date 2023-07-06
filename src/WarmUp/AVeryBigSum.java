package WarmUp;

import java.util.List;

public class AVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long x = 0;
        long result = 0;
        for(int i = 0; i < ar.size(); i++){
            x = ar.get(i);
            result += x;
        }
        return result;
    }
}
