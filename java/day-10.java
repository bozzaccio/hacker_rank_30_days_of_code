import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binaryValue = Integer.toBinaryString(n);
        int consecutiveCounter = 0;
        int maxCC = 0;
        
        for (char c: binaryValue.toCharArray()) {
            
            if (c == '1') {
                consecutiveCounter = consecutiveCounter + 1;
                if (maxCC < consecutiveCounter) {
                    maxCC = consecutiveCounter;
                }
            }
            else {
                if (maxCC < consecutiveCounter) {
                    maxCC = consecutiveCounter;
                }
                consecutiveCounter = 0;
            }
        
        }
        
        System.out.println(maxCC);
        scanner.close();
    }
}
