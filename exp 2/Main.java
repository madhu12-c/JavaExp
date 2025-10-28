
 public class Main  {
    public static void main(String[] args) {
        // Using Default Constructor
        Calculator c1 = new Calculator();

        // Using Parameterized Constructor
        Calculator c2 = new Calculator(15, 25);

        // Calling Overloaded Methods
        c1.add();                 // No parameters
        c1.add(20, 30);           // Two integers
        c1.add(12.5f, 15.5f, 10f); // Three floats
    }
}
 
    

