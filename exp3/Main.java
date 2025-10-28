class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String course;
    int rollNumber;

    Student(String name, int age, String course, int rollNumber) {
        super(name, age);
        this.course = course;
        this.rollNumber = rollNumber;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Course: " + course);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class GraduateStudent extends Student {
    int graduationYear;

    GraduateStudent(String name, int age, String course, int rollNumber, int graduationYear) {
        super(name, age, course, rollNumber);
        this.graduationYear = graduationYear;
    }

    void displayGraduateDetails() {
        displayStudentDetails();
        System.out.println("Graduation Year: " + graduationYear);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacherDetails() {
        displayPersonDetails();
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person {
    String department;

    Administrator(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayAdminDetails() {
        displayPersonDetails();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Student Details (Single Inheritance) ---");
        Student s = new Student("Rahul", 20, "B.Tech", 123);
        s.displayStudentDetails();

        System.out.println("\n--- Graduate Student Details (Multilevel Inheritance) ---");
        GraduateStudent gs = new GraduateStudent("Anjali", 22, "M.Tech", 456, 2023);
        gs.displayGraduateDetails();

        System.out.println("\n--- Teacher Details (Hierarchical Inheritance) ---");
        Teacher t = new Teacher("Meera", 35, "Mathematics");
        t.displayTeacherDetails();

        System.out.println("\n--- Administrator Details (Hierarchical Inheritance) ---");
        Administrator a = new Administrator("Raj", 40, "HR");
        a.displayAdminDetails();
    }
}
