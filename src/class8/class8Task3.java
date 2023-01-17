package class8;

import java.util.Scanner;

public class class8Task3 {
    public static void main(String[] args) {

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
            }
        }
        System.out.println("The sum of the even numbers is " +even);
        System.out.println("The sum of the odd numbers is " +odd);

    }
}
