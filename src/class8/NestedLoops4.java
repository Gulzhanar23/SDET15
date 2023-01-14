package class8;

public class NestedLoops4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                for (int j = 0; j <= 5; j++) {
                    System.out.print(j + " ");
                }
            } else if (i == 1) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print(+j + " ");
                }
            } else if (i == 2) {
                for (int j = 2; j <= 5; j++) {
                    System.out.print(+j + " ");
                }
            }
            System.out.println();
        }
        System.out.println("************");

        for (int i = 0; i < 3; i++) {
            for (int j = i; j <= 5; j += 1) {

                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("************");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 1 && j == 0 || i == 2 && j == 0 || i == 2 && j == 1) {
                    System.out.print("");
                    continue;

                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("******");
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j+=2) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

