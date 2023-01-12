package class5;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String month=scan.next();
        String season;

       switch (month){
           case "December":
           case "January":
           case "February":
               season="Winter";
               break;
           case "March":
           case "April":
           case "May":
                season="Spring";
                break;
           case "June":
           case "July":
           case "August":
                 season="Summer";
                 break;
           case "September":
           case "October":
           case "November":
                 season="Autumn";
                 break;
           default:
               season="Invalid month";

       } System.out.println("You were born in " +season);
    }
}


//4)Write a program for user to enter his/hers birth month.
// Based on the month define the season.
//Example: if user is born in June, July or August → season =”Summer”.
//At the end of the program we should see output as “You were born __”.
