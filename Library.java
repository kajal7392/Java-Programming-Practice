//Create a class Library with a static block that prints "Library is open!" 
//and a constructor that prints "A new book has been added!". Demonstrate the 
//order of execution when you create an object of the Library class in the 
//main() method.

package Constructor;

public class Library {
    Library() {
        System.out.println("A new book has been added");
    }

    static {
        System.out.println("Library is open!");
    }

    public static void main(String[] args) {
        Library obj = new Library();
    }
}
