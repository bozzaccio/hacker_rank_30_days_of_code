import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int wordCounter = scanner.nextInt();
        ArrayList words = new ArrayList<String>();
        
        for(int i = 0; i<wordCounter; i++){
            
            String word = scanner.next();
            String result;
            String oddString = "";
            String evenString = "";
            
            char[] charArray = word.toCharArray();
            
            for(int j =0; j < charArray.length ; j++){
                
                if(j == 0 || j % 2 == 0){
                    evenString = evenString + charArray[j];
                } else {
                    oddString = oddString + charArray[j];
                }
            }
            
            result = evenString + " " + oddString;
            System.out.println(result);
        }
        
        
        scanner.close();
    }
}
