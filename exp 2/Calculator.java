
    public class Calculator {

    // Default Constructor
    Calculator() {
        System.out.println("Welcome to the Calculator!");
    }

    // Parameterized Constructor
    Calculator(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    // Method Overloading - No parameters
    public void add() {
        int a = 5, b = 10;
        System.out.println("Sum of default numbers " + a + " and " + b + " is: " + (a + b));
    }

    // Method Overloading - Two integer parameters
    public void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    // Method Overloading - Three float parameters
    public void add(float a, float b, float c) {
        System.out.println("Sum of " + a + ", " + b + " and " + c + " is: " + (a + b + c));
    }
}


