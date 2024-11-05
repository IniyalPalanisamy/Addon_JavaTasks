package problemsolving_Numbers;

import java.util.Scanner;

public class Fibonacci {

    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Return n if it's 0 or 1
        }
        
        int a = 0, b = 1; // Starting values for Fibonacci
        for (int i = 2; i <= n; i++) {
            int temp = a + b; // Calculate the next Fibonacci number
            a = b; // Update a to the previous b
            b = temp; // Update b to the new Fibonacci number
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        
        System.out.println("Output: " + fibonacci(n));
        
        scanner.close();
    }
}
