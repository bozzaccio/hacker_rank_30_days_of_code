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
        
        String w = "Weird";
        String nw = "Not Weird";
        
        if(n % 2 != 0){
            print(w);
        } else if (n % 2 == 0 && (n >= 2 && n <= 5)){
            print(nw);
        } else if(n % 2 == 0 && (n > 6 && n <= 20)){
            print(w);
        } else if(n % 2== 0 && n > 20){
            print(nw);
        }
        

        scanner.close();
    }
    
    private static void print(String s){
        System.out.println(s);
    }
}
