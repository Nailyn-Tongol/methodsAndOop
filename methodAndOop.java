// Student class
class Student {

    // Private attributes
    private String name;
    private int age;
    private double grade;

    // Method to set student details
    public void setDetails(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    // Method to get student name
    public String getName() {
        return name;
    }

    // Method to check if student passed
    public boolean isPassed() {
        return grade >= 75;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        
        if (isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Create Student object
        Student student1 = new Student();

        // Set details
        student1.setDetails("Ana Cruz", 20, 85.5);

        // Call methods
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Passed? " + student1.isPassed());
        System.out.println();

        student1.displayInfo();
    }
}