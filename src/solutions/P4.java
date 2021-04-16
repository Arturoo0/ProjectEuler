package solutions;
import java.lang.Math;

public class P4 extends RunFile {
    private boolean isPalindrome(int val){
        int copy = val;
        int reversed = 0;
        while (val != 0){
            int rem = val % 10;
            reversed = (reversed * 10) + rem;
            val /= 10;
        }
        return (copy == reversed);
    }

    private int compute(){
        final int LOWERBOUND = 900;
        int result = 0;
        for (int i = LOWERBOUND; i <= 999; i++){
            for (int j = LOWERBOUND; j <= 999; j++){
                if (isPalindrome(i * j)) 
                    result = Math.max(result, i * j);
            }
        }
        return result;
    }

    public String run(){
        return String.valueOf(compute());
    }
}