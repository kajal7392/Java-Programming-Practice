//Create an outer class University with an inner class Department. The 
//Department class should have a constructor that initializes the 
//departmentName and numberOfStudents. Create objects of both the outer and 
//inner classes and display the department details.

package Constructor;

public class University {
    class Department {
        String departmentName;
        int numberOfStudents;

        Department(String departmentName,int numberOfStudents) {
            this.departmentName=departmentName;
            this.numberOfStudents=numberOfStudents;
        }
    }

        public static void main(String[] args) {
            University outerobj = new University();
            University.Department innerobj = outerobj.new Department("B.Tech", 110);
            System.out.println("Account details: ");
            System.out.println("Department Name: "+innerobj.departmentName);
            System.out.println("Number of Students: "+innerobj.numberOfStudents);
        }
}
