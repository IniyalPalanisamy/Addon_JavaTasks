package problemsolving_Numbers;

import java.util.Scanner;

public class ReverseNumber {
    
    // Function to reverse the number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to reversed
            number /= 10; // Remove the last digit
        }
        return reversed; // Return the reversed number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the function to reverse the number
        int result = reverseNumber(number);
        
        // Output the result
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
