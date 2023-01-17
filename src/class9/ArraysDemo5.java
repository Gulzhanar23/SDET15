package class9;

public class ArraysDemo5 {
    public static void main(String[] args) {
        int sum = 0;

        int[] numbers = {10, 20, 30, 4, 5, 6, 7, 80};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
                System.out.println(sum);}
        }


