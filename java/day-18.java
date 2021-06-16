import java.io.*;
import java.util.*;

public class Solution {
    
    Stack<Character> stack = new Stack<Character>();
    List<Character> queue = new ArrayList<Character>();
    
    /**
    * Add a char into the class stack object.
    * @param c
    **/
    private void pushCharacter(char c) {
        this.stack.push(c);
    }
    
    /**
    * Remove a Character from the stack and returned the char value.
    **/
    private char popCharacter() {
        Character c = this.stack.pop();
        return c.charValue();
    }

    /**
    * Add a char into the class queue object.
    * @param c
    **/
    private void enqueueCharacter(char c) {
        this.queue.add(c);
    }
    
    /**
    * Remove a Character from the queue and returned the char value.
    **/
    private char dequeueCharacter() {
        Character c = this.queue.remove(0);
        return c.charValue();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
