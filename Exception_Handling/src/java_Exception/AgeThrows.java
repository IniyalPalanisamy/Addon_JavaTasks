package java_Exception;


public class AgeThrows {
    // Method to check age and throw exceptions based on conditions
    static void checkAge(int age) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        if (age <= 0) {
            throw new ArrayIndexOutOfBoundsException("Invalid age: age cannot be less than or equal to 0.");
        } else if (age < 18) {
            throw new ArithmeticException("Under 18: Age is less than 18.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        int age = -1; // Test age value
        try {
            checkAge(age); // Call checkAge and handle any exceptions
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Catch the thrown exceptions and print an error message
            System.out.println("Exception occurred: " + e.getMessage());
   
        }
    }
}
