import java.util.Scanner;

public class Hello {

public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		 System.out.print("Enter the principal amount: ");
	     double principal = in.nextDouble();
	     
	     System.out.print("Enter the rate of interest (in %): ");
	     double rate = in.nextDouble();

	     System.out.print("Enter the time (in years): ");
	     double time = in.nextDouble();
	     double simpleInterest = (principal * rate * time) / 100;

	     System.out.println("Simple Interest is: " + simpleInterest);

	     in.close();

		
	}
}
