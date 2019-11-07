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
        System.out.println(ps.surroundMe("cde", "abfg"));                   //→ "abcdefg"
        System.out.println(ps.surroundMe(null, "####"));                    //→ null
        System.out.println(ps.surroundMe("abc", null));                     //→ "abc"
        System.out.println(ps.surroundMe("abc", "123"));                    //→ "abc"
        System.out.println(ps.surroundMe("abc", "12\n3"));                  //→ "12abc\n3"
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

        System.out.println("\033[1mEXERCISE 6:\033[0m");
        System.out.println(ps.triplets("aaabbbccc"));                       //→ 3
        System.out.println(ps.triplets("aaaa"));                            //→ 2
        System.out.println(ps.triplets("abc"));                             //→ 0
        System.out.println(ps.triplets(null));                              //→ -1
        System.out.println(ps.triplets("tttxg\n\n\n\n"));                   //→ 3
        System.out.println();

        System.out.println("\033[1mEXERCISE 7:\033[0m");
        System.out.println(ps.addMe("123 abc 123"));                        //→ 12
        System.out.println(ps.addMe("abcdefghijk"));                        //→ 0
        System.out.println(ps.addMe(null));                                 //→ -1
        System.out.println(ps.addMe("\n\n\t9"));                            //→ 9
        System.out.println();

        System.out.println("\033[1mEXERCISE 8:\033[0m");
        System.out.println(ps.sequence("abbcccdddd"));                      //→ 4
        System.out.println(ps.sequence("aAabBbBb"));                        //→ 1
        System.out.println(ps.sequence(""));                                //→ 0
        System.out.println(ps.sequence(null));                              //→ -1
        System.out.println();

        System.out.println("\033[1mEXERCISE 9:\033[0m");
        System.out.println(ps.intertwine("aceg", "bdfh"));                  //→ "abcdefgh"
        System.out.println(ps.intertwine("abc", "12345"));                  //→ "a1b2c345"
        System.out.println(ps.intertwine("12345", "abc"));                  //→ "1a2b3c45"
        System.out.println(ps.intertwine(null, "abcd"));                    //→ null
        System.out.println(ps.intertwine("abcd", null));                    //→ null
        System.out.println(ps.intertwine(null, null));                      //→ null
        System.out.println();

        System.out.println("\033[1mEXERCISE 10:\033[0m");
        System.out.println(ps.isPalindrome("racecar"));                     //→ true
        System.out.println(ps.isPalindrome("Madam"));                       //→ false
        System.out.println(ps.isPalindrome(null));                          //→ false
        System.out.println(ps.isPalindrome(""));                            //→ true
        System.out.println(ps.isPalindrome("a"));                           //→ true
        System.out.println(ps.isPalindrome("madam"));                       //→ true
        System.out.println(ps.isPalindrome("12321"));                       //→ true
        System.out.println(ps.isPalindrome("\n8\n"));                       //→ true
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
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {
        if (text == null) {
            return -1;
        } else {
            char previousChar = '\0';
            int sequence = 0;
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (i == 0) {
                    previousChar = text.charAt(i);
                } else {
                    if (text.charAt(i) == previousChar) {
                        sequence++;
                    }
                    if (text.charAt(i) != previousChar) {
                        sequence = 0;
                        previousChar = text.charAt(i);
                    } else if (sequence >= 2) {
                        count++;
                    }
                    
                }
            }
            return count;
        }
    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
        if (text == null) {
            return -1;
        } else {
            long sum = 0L;
            for (int i = 0; i < text.length(); i++) {
                int charInt = 0;
                try {
                    charInt = Integer.parseInt(String.valueOf(text.charAt(i)));
                    sum += charInt;
                } catch (Exception e) {}
            }
            return sum;
        }
    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {
        if (text == null) {
            return -1;
        } else {
            char previousChar = '\0';
            long consecutive = 1L;
            long largestConsecutive = 0L;
            for (int i = 0; i < text.length(); i++) {
                if (i == 0) {
                    previousChar = text.charAt(i);
                } else {
                    if (text.charAt(i) == previousChar) {
                        consecutive++;
                    }
                    if (text.charAt(i) != previousChar) {
                        consecutive = 1L;
                        largestConsecutive = (consecutive > largestConsecutive) ? consecutive : largestConsecutive;
                        previousChar = text.charAt(i);
                    } else if (consecutive > largestConsecutive) {
                        largestConsecutive = (long) consecutive;
                    }
                    
                }
            }
            return largestConsecutive;
        }
    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {
        if (a == null || b == null) {
            return null;
        } else {
            String output = "";
            int maxLength = (a.length() > b.length()) ? a.length() : b.length();
            for (int i = 0; i < maxLength; i++) {
                if (i < a.length()) {
                    output += String.valueOf(a.charAt(i));
                }
                if (i < b.length()) {
                    output += String.valueOf(b.charAt(i));
                }
            }
            return output;
        }
    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        } else {
            String reversed = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += String.valueOf(text.charAt(i));
            }
            return (reversed.equals(text));
        }
    }
}
