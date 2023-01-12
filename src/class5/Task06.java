package class5;
import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {

        int num1, num2, num3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1>num2 && num1>num3) {
        System.out.println("The largest number is "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The largest number is "+num2);
        }else{
            System.out.println("The largest number is "+num3);
        }
    }
}
//6)Write a program to find largest number among
// three numbers using nested if provided by a user (numbers must be distinct)