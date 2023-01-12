package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("My name is "+name);
    }
}
//Write  a program that takes user's first name and last name and prints in console
//
//Instruct the user to enter first name: "Please Enter First Name"
//
//Capture the first name
//
//Instruct the user to enter last name:"Please Enter Last Name"
//
//Capture last name
//
//Print first name and last name