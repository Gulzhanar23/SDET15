package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        /*System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("Your are "+age+" Years old");

        System.out.println("Please Enter your weight");
        double weight=scanner.nextDouble();
        System.out.println("Your weight is "+weight+" kgs");*/

        /*System.out.println("Please Enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please Enter your name");
        String name=scanner.next(); // When you have to taken only one word as input
                System.out.println("Your name is "+name);

        scanner.nextLine(); //Trick to make nextLine method work after we have used any other method from Scanner class
        System.out.println("Please Enter your full name");
        String fullName=scanner.nextLine();
        System.out.println("Your full name is "+fullName);
        scanner.close(); // Good practice




    }
}
