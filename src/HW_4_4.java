/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;

public class HW_4_4 {
    public static void main(String args[]) {

        Random random = new Random();

        double array[] = new double[50];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(512) - 256;

            System.out.print(array[i] + " ");

            if (array[i] > 0) sum1++;
            else {
                if (sum1 > sum2) {
                    sum2 = sum1;
                    sum1 = 0;
                } else sum1 = 0;
            }
        }
        System.out.println("\n" + sum2);
    }
}
