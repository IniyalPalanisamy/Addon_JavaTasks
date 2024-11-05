package problemsolving_Numbers;


import java.util.Scanner;

public class SumOfSquaresOfDigits {

    
    public static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit * digit;     // Add the square of the digit
            number /= 10;             // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        System.out.println("Sum of squares of digits: " + sumOfSquares(number));

        scanner.close();
    }
}

