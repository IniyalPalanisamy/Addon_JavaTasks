import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of " + number + " is " + sum + ".");
        
        scanner.close();
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // Add the last digit to the sum
            n /= 10;        // Remove the last digit
        }

        return sum;
    }
}
