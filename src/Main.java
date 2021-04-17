import solutions.*;
import java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String [] args){
        printSols();
    }
    
    private static void printSols(){
        RunFile [] sols = {new P1(), new P2(), new P3(), new P4(), new P5(), new P6(), new P7(), new P8()};
        for (int i = 0; i < sols.length; i++){
            long start = System.nanoTime();
            String output = sols[i].run();
            long finish = System.nanoTime();
            String strOutput = String.format("%d: %s | ~%dms", (i+1), output, TimeUnit.NANOSECONDS.toMillis(finish-start));
            System.out.println(strOutput);
        }
    }
}
