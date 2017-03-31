/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;

public class HW_4_3 {
    public static void main(String args[]) {

        Random random = new Random();

        int array[] = new int[18];
        int sum1 = 0, sum2 = 0, sum3 = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);

            if (i < 7) sum1 += array[i];
            else if (i > 6 && i < 13) sum2 += array[i];
            else sum3 += array[i];
        }

        System.out.println(sum1 + " " + sum2 + " " + sum3);

        if (sum1 > sum2 && sum1 > sum3) System.out.println("Больше всего баллов по обязательной программе.");
        else if (sum2 > sum1 && sum2 > sum3) System.out.println("Больше всего баллов по короткой программе.");
        else System.out.println("Больше всего баллов по произвольной программе.");
    }
}
