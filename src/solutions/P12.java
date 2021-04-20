package solutions;

public class P12 extends RunFile {
    private long summation(long n){
        return (n * (n + 1))/2;
    }

    private int numberOfDivisors(long val){
        int totalDivisors = 0;
        for (long i = 1; i < Math.sqrt((double) val) + 1; i++){
            if (val % i == 0) totalDivisors += 2;
        }
        return totalDivisors;
    }

    private long compute(){
        final int DIVISORSNEEDED = 500;
        int divisors = 0;
        long currNum = 1;
        while (divisors <= 500){
            divisors = numberOfDivisors(summation(currNum));
            currNum++;
        }
        return summation(--currNum);
    }

    public String run(){
        return String.valueOf(compute());
    }
}