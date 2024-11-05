package java_Exception;

public class CheckAge {
	 public static void main(String[] args) {
		 int age=10;
		 if(age<18) {
			 throw new ArithmeticException("Under 18");
		 }
	 }
}

//output
//Exception in thread "main" java.lang.ArithmeticException: Under 18
//at Exception_Handling/java_Exception.CheckAge.main(CheckAge.java:7)
    