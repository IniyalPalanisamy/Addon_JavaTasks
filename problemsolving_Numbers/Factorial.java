package problemsolving_Numbers;

import java.util.Scanner;

public class Factorial {

    
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by each number
        }
        return factorial; // Return the result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        
        int result = calculateFactorial(number);
        
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}

