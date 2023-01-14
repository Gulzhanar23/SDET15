package class8;

public class NestedLoops7 {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 15; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("******");

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(3 * i + " ");
        }
        System.out.println("********");

    }
}