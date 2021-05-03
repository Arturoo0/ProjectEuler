package solutions;
import java.util.Stack;

public class P15 extends RunFile {
    private final int R = 21;
    private final int C = 21;
    private long[][] GRID = generateGrid(R, C);
    private long[][] generateGrid(int r, int c){
        return new long[r][c];
    }

    private boolean isValidCoord(int r, int c){
        if (r < 0 || r > GRID.length - 1) return false; 
        if (c < 0 || c > GRID[0].length - 1) return false;
        return true;
    }

    private boolean reachedEnd(int r, int c){
        if (r == R - 1 && c == C - 1) return true;
        return false;
    }

    private int computeBrute(){
        Stack<int[]> stack = new Stack<int[]>();
        stack.push(new int[]{0, 0});
        int res = 0;
        while (!stack.empty()){
            int coords[] = stack.pop(); 
            int r = coords[0], c = coords[1];
            if (reachedEnd(r, c)) res++; 
            if (isValidCoord(r + 1, c)) 
                stack.push(new int[]{r + 1, c});
            if (isValidCoord(r, c + 1))
                stack.push(new int[]{r, c + 1});
        }
        return res;
    }

    private long computeDP(){
        GRID[0][0] = 1;
        for (int r = 0; r < GRID.length; r++){
            for (int c = 0; c < GRID[r].length; c++){
                if (isValidCoord(r - 1, c)) 
                    GRID[r][c] += GRID[r - 1][c]; 
                if (isValidCoord(r, c - 1))
                    GRID[r][c] += GRID[r][c - 1]; 
            }
        }
        return GRID[R - 1][C - 1];
    }

    private long compute(){
        return computeDP();
    }

    public String run(){
        return String.valueOf(compute());
    }
}