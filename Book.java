// Create a class Book with three constructors:
//  1. A no-argument constructor that initializes title to "Unknown" and 
//     author to "Anonymous".
//  2. A constructor that takes only title as an argument.
//  3. A constructor that takes both title and author as arguments. Use 
//     constructor chaining to reduce code duplication.


package Constructor;

public class Book {
    String title;
    String author;

    Book() {
        this("Unknown","Anonymous");
    }

    Book(String title) {
        this(title,"Anonymous");
    }

    Book(String title,String author) {
        this.title=title;
        this.author=author;
    }

    void displayBookdetails() {
        System.out.println("Book Title: "+title);
        System.out.println("Book author: "+author);
    }

    public static void main(String[] args) {
        Book obj1 = new Book();
        Book obj2 = new Book("Biology");
        Book obj3 = new Book("Mathematics", "R.K. Sharma");

        obj1.displayBookdetails();
        obj2.displayBookdetails();
        obj3.displayBookdetails();
    }
}

