package class8;

public class NestedLoops5 {
    public static void main(String[] args) {
        
        /*12345
          12345
          12345
         */

        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 2 || i == 3) {
                System.out.println("*           *");
                continue;
            }
            for (int j = 0; j < 5; j++) {

                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
