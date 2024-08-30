//Create a class Rectangle with two constructors. One constructor should take 
//both length and breadth as parameters, and the other should initialize a 
//square (where length and breadth are equal). Create objects using both 
//constructors and display the area of the rectangles.

package Constructor;

public class Rectangle {
    float length;
    float breadth;

    public Rectangle (float length, float breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(float side) {
        this.length=side;
        this.breadth=side;
    }

    void displayArea() {
        System.out.println("Area: "+(length*breadth));
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 4);
        Rectangle sqr = new Rectangle(4);
        rect.displayArea();
        sqr.displayArea();
    }
}
