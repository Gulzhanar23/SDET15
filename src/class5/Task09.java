package class5;
import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {

        double result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double number1 = scan.nextInt();
        System.out.println("Please enter the second number");
        double number2 = scan.nextInt();
        System.out.println("Enter the operators");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Wrong operator");
                return;
        }

            System.out.println("The result is " + result);
        }
    }

//8)HomeWork: Using scanner class create calculator.
// Allow user to enter 2 numbers and operator(+,-,*,/).
// Based on operator provide the result to user.