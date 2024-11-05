package problemsolving_Numbers;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        
        if (N <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
           
            int sum = sumOfNaturalNumbers(N);
            System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
        }

        
        scanner.close();
    }

    
    public static int sumOfNaturalNumbers(int N) {
        // Using the formula: sum = N * (N + 1) / 2
        return N * (N + 1) / 2;
    }
}

