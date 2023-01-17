package class9;

public class Class9Task5 {
    public static void main(String[] args) {
        int sum = 0;
        int[] num = new int[5];
        num[0] = 11;
        num[1] = 22;
        num[2] = 33;
        num[3] = 44;
        num[4] = 55;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        {
            System.out.println(sum);
        }


    }
}

//            total+=numbers[i];}