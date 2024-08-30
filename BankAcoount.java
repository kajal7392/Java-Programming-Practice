//Create a class BankAccount with a final instance variable accountNumber. 
//Initialize this variable using a constructor. Ensure that the value cannot 
//be changed after initialization. Write a method displayAccountDetails() to 
//print the account number.

package Constructor;

public class BankAcoount {
    final int accountNumber;

    BankAcoount(int accountNumber) {
        this.accountNumber=accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Your account number is: "+accountNumber);
    }

    public static void main(String[] args) {
        BankAcoount obj = new BankAcoount(223712);
        obj.displayAccountDetails();
    }
}
