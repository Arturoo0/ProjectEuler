import solutions.*;
import java.util.concurrent.TimeUnit;
public class Main {
    static RunFile [] sols = {new P1(), new P2(), new P3(), new P4(), new P5(), new P6(), new P7(), new P8(), new P9(), new P10(), new P11(), new P12(), new P13()};
    public static void main(String [] args){
        if (isValid(args)) printSols(Integer.parseInt(args[0]));
        else {
            System.out.println("Invalid/No args provided.");
            printSols(1);
        }
    }
    
    private static void printSols(int startingProblem){
        for (int i = startingProblem - 1; i < sols.length; i++){
            long start = System.nanoTime();
            String output = sols[i].run();
            long finish = System.nanoTime();
            String strOutput = String.format("%d: %s | ~%dms", (i+1), output, TimeUnit.NANOSECONDS.toMillis(finish-start));
            System.out.println(strOutput);
        }
    }

    private static boolean isValid(String[] input){
        if (input.length == 0) return false;
        int castedFormat = Integer.parseInt(input[0]);
        if (castedFormat < 1 || castedFormat > sols.length) return false;
        return true;
    } 
}
