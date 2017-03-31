/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;

public class HW_4_1 {
    public static void main(String args[]) {
        Random random = new Random();

        int array[] = new int[35];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7000);
            sum += array[i];
        }

        if (sum > 99999)
            System.out.println("Книг в библиотеке есть шестизначное число. " + sum);
        else System.out.println("Книг меньше чем шестизначное число, а именно: " + sum);

    }
}
