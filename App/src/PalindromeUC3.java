import java.util.Scanner;
public class PalindromeUC3 {
    public static void main(String[] args) {
        String input, reversed = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        input = sc.next();
        for (int i = input.length()-1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindrome = false;
        if (input.equals(reversed)) {
            isPalindrome = true;
        }
        System.out.println("Is palindrome?: " + isPalindrome);
    }
}
