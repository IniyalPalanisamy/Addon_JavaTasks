package problemsolving_Numbers;

import java.util.Scanner;

public class GCD {
    //Greatest common divisor
   
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b; // Store b in a temporary variable
            b = a % b; // Update b to the remainder of a divided by b
            a = temp; // Update a to the previous value of b
        }
        return a; // a contains the GCD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
       
        int gcd = calculateGCD(num1, num2);
        
        
        System.out.println("Output: " + gcd);
        
        scanner.close();
    }
}
