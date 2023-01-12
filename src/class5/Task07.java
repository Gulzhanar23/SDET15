package class5;
import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) {

        String country;

        Scanner scan=new Scanner(System.in);
        System.out.println("Where are you from?");
        country=scan.next();

        if (country.equals("Kazakhstan")){
            System.out.println("So you speak Kazakh");
        }
        if (country.equals("France")){
            System.out.println("So you speak French");
        }
        if (country.equals("Denmark")){
            System.out.println("So you speak Danish");
        }

    }
}
//7) Ask user to enter their country and capture it.
// Once values are captured print which language user speaks.
//
