// Create a class Car with instance variables make, model, and year. Write a 
// constructor that initializes these variables. Create an object of the Car 
// class in the main() method and print the details of the car using a method 
// displayCarDetails().

package Constructor;

public class Car {
    String make;
    String model;
    int year;

    Car (String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    void displayCarDetails() {
        System.out.println("Car details: ");
        System.out.println("Make: "+ make);
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
    }

    public static void main(String[] args) {
        Car obj = new Car("Hyundai", "I20",2001);
        obj.displayCarDetails();
    }
}
