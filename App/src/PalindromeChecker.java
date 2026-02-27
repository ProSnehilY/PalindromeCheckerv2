/*
@author Snehil
@version 1.0
 */
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        String input;
        boolean isPalindrome = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        input = sc.next();

        for (int i = 0; i < input.length() / 2; i++) {
            char ch = input.charAt(i);
            char last = input.charAt(input.length()-i-1);
            if (ch == last) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
            last--;
        }
        System.out.println("Is it a Palindrome?: " + isPalindrome);
//        System.out.println("Welcome to Palindrome Checker App Management System");
//        System.out.println("Version : 1.0");
//        System.out.println("System initialised successfully");
    }
}
