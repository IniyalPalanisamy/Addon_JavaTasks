package java_Exception;

public class TwoSum {
	  public static void main(String[] args) {
		 // int[] arr= {1,2,3};
		  int a=10;
		  int b=0;
		  
		  try {
			 // System.out.print(arr[7]); //outofboundError
			  System.out.print(a/b);  //divide by 0 error ,/ by zero
		  }
		  catch(Exception error) {
			 System.err.println(error.getMessage());
		  }
		  finally {
			  System.err.println("Executed");
		  }
	  }
}
