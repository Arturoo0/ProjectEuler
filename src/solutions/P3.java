package solutions;
import java.lang.Math;

public class P3 extends RunFile {
    private boolean isPrime(long val){
        if (val % 2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(val); i++){
            if (val % i == 0) return false;
        }
        return true;
    }

    private int compute(){
        final long TOPBOUND = 600851475143L;
        long largestPrimeFactor = 0;
        for (long i = 1; i * i < TOPBOUND; i++){
            if (!isPrime(i)) continue;
            if (TOPBOUND % i == 0){
                largestPrimeFactor = Math.max(largestPrimeFactor, i);
            }
        }
        return (int)largestPrimeFactor;
    }

    public String run(){
        return String.valueOf(compute());
    }
}