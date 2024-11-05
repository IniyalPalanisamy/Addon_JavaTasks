package problemsolving_Numbers;

import java.util.Scanner;

public class PalindromeNumber {

   
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversed = 0; // Variable to hold the reversed number

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        return originalNumber == reversed; // Check if the original is equal to the reversed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
      
        boolean result = isPalindrome(number);
        
       
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
