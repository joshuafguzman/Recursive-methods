/**
 * If you do not use recursion, you will receive 0 points. You can delete the
 * content of the methods before you start your work. You should not change the
 * method definition.
 * @author Joshua Guzman
 * @since 2022 march 28
 */
public class Recursion {
    /**
     * Method to reverse a given string
 * @param s given string
 * @return reverse using recursion to reverse string
 */
    public static String reverse(String s) {
        if(s.isEmpty()) //checks if string is empty or not
            return s;

        return reverse(s.substring(1)) +s.charAt(0);
    }
    /**
     * Method to check if a string is a palindrome
 * @param s given string
 * @return false is false if string is not a palindrome
 */
    public static boolean isPalindrome(String s) {
        //if length is 0 or 1 then string is palindrome
        if(s.length() ==0 ||s.length() ==1)
            return true;

        //check first and last char of string
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1, s.length()-1));

        return false; //if string is not palindrome return false
    }
    /**
     * Method to give the length of the string
 * @param s given string
 * @return length uses recursion to give the length of the string
 */
    public static int length(String s) {
        /*
         * Donot return s.length() Use recursion to solve this
         */
        if(s.equals("")) //if end of the string
            return 0;
        else 
            return length(s.substring(1))+1;

    }
    
}
