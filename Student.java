//Create a class Student with instance variables name, age, and grade. Write 
//both a default constructor that sets name to "Unknown", age to 0, and grade 
//to "Not Assigned", and a parameterized constructor that initializes these 
//variables. Write a method displayStudentDetails() to print the details of 
//the student.

package Constructor;

public class Student {
    String name;
    int age;
    String grade;

    Student() {
        this("Unknown",0,"Not Assigned");
    }

    Student(String name,int age,String grade) {
        this.name=name;
        this.age=age;
        this.grade=grade;
    }

    void displayStudentDetails() {
        System.out.println("Student details: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
    }

    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student("Alisha",15,"A+");
        obj1.displayStudentDetails();
        obj2.displayStudentDetails();
    }
}
