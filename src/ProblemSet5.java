/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

 import java.util.Scanner;

public class ProblemSet5 {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        ProblemSet5 ps = new ProblemSet5();
        // switch (args[0]) {
        //     case "surroundMe":
        //         if (args[1].equals("")) {
        //             args[1] = null;
        //         }
        //         if (args[2].equals("")) {
        //             args[2] = null;
        //         }
        //         break;
        
        //     default:
        //         break;
        // }

        // if (args[0].equals("surroundMe")) {
        //     System.out.println(ps.surroundMe(args[1], args[2]));
        // }
        System.out.println();
        System.out.println("\033[1mEXERCISE 1:\033[0m");
        System.out.println(ps.surroundMe("cde", "abfg"));
        System.out.println(ps.surroundMe(null, "####"));
        System.out.println(ps.surroundMe("abc", null));
        System.out.println(ps.surroundMe("abc", "123"));
        System.out.println(ps.surroundMe("abc", "123"));
        System.out.println();

        System.out.println("\033[1mEXERCISE 2:\033[0m");
        System.out.println(ps.endsMeet("abcdefg", 2));                      //→ "abfg"
        System.out.println(ps.endsMeet(null, 2));                           //→ null
        System.out.println(ps.endsMeet("", 2));                             //→ ""
        System.out.println(ps.endsMeet("abc", -1));                         //→ "abc"
        System.out.println(ps.endsMeet("ab\nc", 2));                        //→ "ab\nc"
        System.out.println();

        System.out.println("\033[1mEXERCISE 3:\033[0m");
        System.out.println(ps.middleMan("abcdefg"));                        //→ "cde"
        System.out.println(ps.middleMan(null));                             //→ null
        System.out.println(ps.middleMan("12"));                             //→ "12"
        System.out.println(ps.middleMan("a"));                              //→ "a"
        System.out.println(ps.middleMan("ibi\ngdo"));                       //→ "i\ng"
        System.out.println();

        System.out.println("\033[1mEXERCISE 4:\033[0m");
        System.out.println(ps.isCentered("abcdefg", "cde"));                //→ true
        System.out.println(ps.isCentered("abcdefg", "abc"));                //→ false
        System.out.println(ps.isCentered(null, "abc"));                     //→ false
        System.out.println(ps.isCentered("abcd", "abc"));                   //→ false
        System.out.println(ps.isCentered("abc", "null"));                   //→ false
        System.out.println(ps.isCentered("abcdefg", "cd"));                 //→ false
        System.out.println();

        System.out.println("\033[1mEXERCISE 5:\033[0m");
        System.out.println(ps.countMe("I am an example sentence", 'e'));    //→ 2
        System.out.println(ps.countMe(null, 'a'));                          //→ -1
        System.out.println(ps.countMe("abc$ def$", '$'));                   //→ -1
        System.out.println(ps.countMe("obama barack", '\u0398'));           //→ -1
        System.out.println();

    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
        try {
            if (in == null) {
                return in;
            } else if (out == null || out.length() != 4) {
                return in;
            } else {
                String output = out.substring(0, out.length() / 2) + in + out.substring(out.length() / 2);
                return output;
            }
        } catch (Exception e) {
            return in;
        }
        
    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
        if (text == null || text.length() > 10 || text.length() < 1 || n > 10 || n < 1) {
            return text;
        } else {
            String output = text.substring(0, n) + text.substring(text.length() - n);
            return output;  
        }
        
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
        if (text == null || text.length() < 3 || text.length() % 2 == 0) {
            return text;
        } else {
            int centerIndex = Math.floorDiv(text.length(), 2);
            String output = text.substring(centerIndex - 1, centerIndex + 2);
            return output;
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
        if (text == null || text.length() < 3 || text.length() % 2 == 0 || target == null || target.length() != 3) {
            return false;
        } else {
            int centerIndex = Math.floorDiv(text.length(), 2);
            String center = text.substring(centerIndex - 1, centerIndex + 2);
            if (center.equals(target)) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        //if (text == null || !(Character.isLetter(suffix)) || !((suffix >= 'a' && suffix <= 'z') || (suffix >= 'A' && suffix <= 'Z'))) {
        if (text == null || !(Character.isLetter(suffix)) || ((suffix < 'a' || suffix > 'z') && (suffix < 'A' || suffix > 'Z'))) {
            return -1;
        }
        String[] words = text.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(words[i].length() - 1) == suffix) {
                count++;
            }
        }
        return count;
        

    }
    
//     /*
//      * Exercise 6.
//      * 
//      * Given a string, compute the number of triplets in text.
//      */
    
//     public int triplets(String text) {

//     }
    
//     /*
//      * Exercise 7.
//      * 
//      * Given a string, compute the sum of the digits in text.
//      */
    
//     public long addMe(String text) {

//     }
    
//     /*
//      * Exercise 8.
//      * 
//      * Given a string, compute the length of the longest sequence.
//      */
    
//     public long sequence(String text) {

//     }
    
//     /*
//      * Exercise 9.
//      * 
//      * Given two strings, return a new string built by intertwining each of the
//      * characters of a and b.
//      */
    
//     public String intertwine(String a, String b) {

//     }
    
//     /*
//      * Exercise 10.
//      * 
//      * Given a string, determine whether or not it is a palindrome.
//      */
    
//     public boolean isPalindrome(String text) {

//     }
}
