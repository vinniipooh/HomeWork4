/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;
import java.util.Scanner;

public class HW_4_5 {
    public static void main(String args[]) {

        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите размерность массива");
        int n = sc.nextInt();

        int array[] = new int[n];
        boolean bool = true;

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(n);

            if (array[i] <= 1)
                continue;

            for (int k = 2; k * k <= array[i]; k++) {
                if (array[i] % k == 0) bool = false;
            }
            if (bool)
                System.out.println(i + "-" + array[i]);

            bool = true;

        }
        System.out.println("Слева находяться номера, а справа значения.");
    }
}

