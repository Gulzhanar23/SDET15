package class4;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you Ready for Holidays");
        boolean ready=input.nextBoolean();
        System.out.println("We are ready for holidays");
    }
}
//Create a program that will ask a user to input boolean value "Input the boolean value"
//
//If the input is true or false, then the output should look like below:
//
//**Example Output:**
//
//```
//Input the boolean value
//```
//
//```
//The value is true
//```
//
//**Example Output:**
//
//```
//Input the boolean value
//```
//
//```
//The value is false
//```