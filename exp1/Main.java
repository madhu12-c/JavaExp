import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    float marks;

    // Method to accept details from user
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextFloat();
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating first object
        Student s1 = new Student();
        System.out.println("Enter details for Student 1:");
        s1.inputDetails();

        // Creating second object
        Student s2 = new Student();
        System.out.println("\nEnter details for Student 2:");
        s2.inputDetails();

        // Displaying details
        s1.displayDetails();
        s2.displayDetails();
    }
}
