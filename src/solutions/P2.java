package solutions;

public class P2 extends RunFile {
    private int compute(){
        final int TOPBOUND = 4000000;
        int i = 1, j = 2, sum = 0;
        while (j < TOPBOUND){
            if (i % 2 == 0) sum += i;
            int temp = j;
            j = i + j;
            i = temp;
        }
        if (i % 2 == 0) sum += i;
        return sum;
    }

    public String run(){
        return String.valueOf(compute());
    }
}