package solutions;

public class P1 extends RunFile {
    private int compute(){
        final int TOPBOUND = 1000;
        int sum = 0;
        for (int i = 1; i < TOPBOUND; i++){
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }

    public String run(){
        return String.valueOf(compute());
    }
}