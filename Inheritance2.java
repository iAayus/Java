// Create a superclass called Person
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Create a subclass called Student that inherits from Person
class Student extends Person {
    String major;
    double gpa;

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
    }
}

// Create another subclass called Teacher that inherits from Person
class Teacher extends Person {
    String subject;
    int yearsOfExperience;

    void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Years of experience: " + yearsOfExperience);
    }
}

// Main class to test inheritance
public class Inheritance2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.age = 20;
        s.major = "Computer Science";
        s.gpa = 3.5;
        System.out.println("Student Info:");
        s.displayStudentInfo();

        System.out.println();

        Teacher t = new Teacher();
        t.name = "Mary";
        t.age = 35;
        t.subject = "Mathematics";
        t.yearsOfExperience = 10;
        System.out.println("Teacher Info:");
        t.displayTeacherInfo();
    }
}
