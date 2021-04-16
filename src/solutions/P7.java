package solutions;

public class P7 extends RunFile {
    private boolean isPrime(int val){
        if (val % 2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(val); i++){
            if (val % i == 0) return false;
        }
        return true;
    }

    private int compute(){
        final int PRIMELOC = 10001;
        int currentNumber = 3;
        int currentPrimes = 0;
        while (currentPrimes < PRIMELOC - 1){
            if (isPrime(currentNumber)) currentPrimes++;
            currentNumber++;
        }
        return currentNumber - 1;
    }

    public String run(){
        return String.valueOf(compute());
    }
}