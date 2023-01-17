package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        int times = 0;

        double[] arr = {10.5, 12.0, 45, 10.5, 23, 10.5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 10.5) {
                times++;
            }
        }
            System.out.println(times);

    }
}