//Write a class Person with instance variables name and age. Create a 
//constructor that initializes these variables. Then, write a copy constructor 
//that creates a new Person object by copying data from another Person object. 
//Demonstrate this functionality in the main() method.

package Constructor;

public class Person {
    String name;
    int age;

    Person(String name,int age) {
        this.name=name;
        this.age=age;
        System.out.println("Another Person: "+name+" "+age);
    }

    Person(Person newperson) {
        this.name=newperson.name;
        this.age=newperson.age;
        System.out.println("New Person: "+newperson.name+" "+newperson.age);
    }

    public static void main(String[] args) {
        Person classobj = new Person("kajal", 21);
        Person copyobj = new Person(classobj);
    }
}
