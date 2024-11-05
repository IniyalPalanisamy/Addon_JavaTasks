package problemsolving_Numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    
    
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length(); // Count digits
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, numDigits); // Add digit raised to the power
            number /= 10; // Remove the last digit
        }

        return sum == originalNumber; // Check if sum equals original number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        boolean result = isArmstrong(number);
        
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}

