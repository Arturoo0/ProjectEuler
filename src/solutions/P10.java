package solutions;

public class P10 extends RunFile {
    private boolean isPrime(int val){
        if (val % 2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(val); i++){
            if (val % i == 0) return false;
        }
        return true;
    }

    // can be improved with sieve
    private long compute(){
        final int TOPBOUND = 2000000;
        long totalSum = 2;
        for (int i = 3; i <= TOPBOUND; i++){
            if (i % 2 == 0) continue;
            if (isPrime(i)) totalSum += i;
        }
        return totalSum;
    }

    public String run(){
        return String.valueOf(compute());
    }
}