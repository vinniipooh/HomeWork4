/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;

public class HW_4_7 {
    public static void main(String args[]) {

        Random random = new Random();

        int array[] = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print("\t" + array[i] + " ");
        }

        System.out.println();

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (j != i && array[j] == array[i])
                    array[i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++)
            System.out.print("\t" + array[i] + " ");

    }
}
