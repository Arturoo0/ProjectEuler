package solutions;
import java.lang.Math;

public class P6 extends RunFile {
    final int TOPBOUND = 100;
    private int sumOfSquares(int n){
        return (n * (n + 1) * (2 * n + 1))/6;
    }

    private double squareOfTheSum(int n){
        return Math.pow((double) (n * (n + 1))/2, 2.0);
    }

    private double compute(){
        return squareOfTheSum(TOPBOUND) - sumOfSquares(TOPBOUND);
    }

    public String run(){
        return String.valueOf(compute());
    }
}