//Create a class Animal with a constructor that initializes the type of the 
//animal. Then create a class Dog that inherits from Animal and adds a breed 
//variable. Write a constructor in Dog that calls the parent constructor using
//super and initializes the breed variable. Display the details of the dog 
//using a method displayDogDetails().

package Constructor;

public class Animal {
    String type;

    Animal(String type) {
        this.type=type;
        System.out.println("Animal class constructor");
    }
}

class Dog extends Animal{
    String breed;

    Dog(String breed,String type) {
        super(type);
        this.breed=breed;
        System.out.println("Dog class  constructor");
    }

    void displayDogDetails() {
        System.out.println("Animal type: "+type);
        System.out.println("Breed: "+breed);
    }

    public static void main(String[] args) {
        Dog obj = new Dog("Labrador", "Mammal");
        obj.displayDogDetails();
    }
}