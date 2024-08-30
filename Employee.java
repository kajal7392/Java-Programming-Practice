//Create a class Employee with private fields name and salary. Provide a 
//constructor to initialize these fields and write getter methods to access 
//them. Ensure that salary cannot be negative, and if a negative value is 
//passed, set it to 0.

package Constructor;

public class Employee {
    private String name;
    private float salary;

    Employee(String name,float salary) {
        this.name=name;
        if(salary<0) {
            this.salary=0;
        }
        else {
            this.salary=salary;
        }
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee obj = new Employee("Alisha",80000);
        System.out.println("Employee name: "+obj.getName());
        System.out.println("Employee salary: "+obj.getSalary());
    }
}
