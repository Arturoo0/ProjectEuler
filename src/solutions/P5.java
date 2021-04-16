package solutions;

public class P5 extends RunFile {
    private boolean isDivisible(int val){
        for (int i = 1; i <= 20; i++){
            if (val % i != 0) return false;
        }
        return true;
    }

    private int compute(){
        int bottomBound = 20;
        while (!isDivisible(bottomBound)){
            bottomBound++;
        }
        return bottomBound;
    }

    public String run(){
        return String.valueOf(compute());
    }
}
