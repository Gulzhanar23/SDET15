package class5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        int day=7;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number");
        day= scan.nextInt();

        if(day >=1 && day <=5)
            System.out.println("Weekday");
        else if (day ==6 || day==7){
            System.out.println("Weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}



//2) Write a program that will print whether it is a weekend or weekday.
// If any day from 1-5 → output “It is a weekday”,
// anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
