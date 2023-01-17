package class8;

import java.util.Scanner;

public class class8Task4 {
    public static void main(String[] args) {

        int change=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("What do you want to buy?");
        String item=scanner.nextLine();
        System.out.println("How much it costs?");
        int price=scanner.nextInt();
        System.out.println("How much do you have?");
        int have=scanner.nextInt();

        for (int i = have; i > price; i++) {
            if (i>price){
                change=have-price;
            }
        }
        System.out.println("There is your change " +change);
        System.out.println("Thank you for shopping!");

    }
}

/*
int even=0, odd=0;
        Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first number in the range");
            int first=scanner.nextInt();
            System.out.println("Enter the second number in the range");
            int second= scanner.nextInt();
        for (int i = first; i <=second ; i++) {
            if (i%2==0){
                even=i+even;
            } else if (i%2!=0) {
                odd=i+odd;
 */