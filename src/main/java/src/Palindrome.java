/*
Given a string A , print Yes if it is a palindrome, print No otherwise.
 */
package src;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String string) {
        StringBuilder reverse = new StringBuilder();
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}