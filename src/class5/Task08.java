package class5;
import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        char grade;
        String explanation;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade");
        grade=scan.next().charAt(0);
        explanation="Not Acceptable";
        if (grade=='A'){
            System.out.println("Your grade is Excellent");
        }
        if (grade=='B'){
            System.out.println("Your grade is Good");
        }
        if (grade=='C'){
            System.out.println("Your grade is Average");
        }
        if (grade=='D'){
            System.out.println("Your grade is Bad");
        }



    }
}
//Allow user to enter grade and then provide explanation:
// A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
// At the end your program should print which grade was entered by a user with explanation.