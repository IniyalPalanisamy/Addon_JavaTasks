package problemsolving_Numbers;

import java.util.Scanner;

public class PerfectNumber {

    
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i; // Add the divisor to sum
            }
        }

        return sum == number; // Check if the sum equals the original number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        boolean result = isPerfectNumber(number);
        
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
