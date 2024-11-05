package problemsolving_Numbers;

import java.util.Scanner;

public class SumOfDigit {
    
    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum; // Return the sum
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        
        int result = calculateSumOfDigits(number);
        
       
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}

