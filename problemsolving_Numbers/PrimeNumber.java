package problemsolving_Numbers;

import java.util.Scanner;

public class PrimeNumber {

    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
       
        boolean result = isPrime(number);
        
        
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}

