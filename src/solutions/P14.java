package solutions;
import java.util.HashMap;

public class P14 extends RunFile {
    // Could also use an array
    private static HashMap<Integer, Integer> cache = new HashMap<>();
    private static final int TOPBOUND = 1000000;
    private int getCollatzLen(int val){
        int valCopy = val, len = 1;
        while (val != 1){
            if (cache.get(val) != null){
                cache.put(valCopy, len + (cache.get(val) - 1));
                return cache.get(valCopy);
            }
            if (val % 2 == 0) val /= 2;
            else val = (3 * val) + 1;
            len++;
        }
        cache.put(valCopy, len);
        return len;
    }

    private int compute(){
        int longestSeq = 1;
        for (int i = 1; i <= TOPBOUND; i++){
            longestSeq = Math.max(longestSeq, getCollatzLen(i));
        }
        return longestSeq;
    }

    public String run(){
        return String.valueOf(compute());
    }
}