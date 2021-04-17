package solutions;

public class P9 extends RunFile {
    private boolean isTriplet(int a, int b, int c){
        a = (int) Math.pow(a, 2);
        b = (int) Math.pow(b, 2);
        if (Math.pow(c, 2) == (a + b)) return true;
        return false;
    }

    private long compute(){
        final int SUMBOUND = 1000;
        for (int a = 1; a < SUMBOUND - 1; a++){
            for (int b = 1; b < SUMBOUND - 1; b++){
                int c = SUMBOUND - (a+b);
                if (isTriplet(a, b, c)) return (a * b * c);
            }
        }
        return -1;
    }

    public String run(){
        return String.valueOf(compute());
    }
}