import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Variable to hold the reversed number
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append it to the reversed number
            number /= 10;  // Remove the last digit from the original number
        }

        // Output the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }
}
