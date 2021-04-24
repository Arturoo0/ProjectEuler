package solutions;
import java.util.HashMap;

public class P14 extends RunFile {
    private final int[] cache = new int[1000000 + 1];
    private static final int TOPBOUND = 1000000;
    private int getCollatzLen(long val){
        int valCopy = (int) val, len = 1;
        while (val != 1){
            if (val < valCopy && cache[(int) val] != 0){
                cache[valCopy] = len + (cache[(int) val]);
                return cache[valCopy];
            }
            if (val % 2 == 0) val /= 2;
            else val = (3 * val) + 1;
            len++;
        }
        cache[valCopy] = len;
        return len;
    }

    private int compute(){
        int longestSeq = 1;
        int number = -1;
        for (int i = 1; i < TOPBOUND; i++){
            int collatzLen = getCollatzLen((long) i);
            if (longestSeq < collatzLen){
                longestSeq = collatzLen;
                number = i;
            }
        }
        return number;
    }

    public String run(){
        return String.valueOf(compute());
    }
}