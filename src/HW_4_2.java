/**
 * Created by Александр on 31.03.2017.
 */

import java.util.Random;
import java.util.Scanner;

public class HW_4_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество балов для перехода в следующий этап: ");
        int need = sc.nextInt();

        int array[] = new int[10];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) + 5;
            sum += array[i];
        }
        if (sum >= need)
            System.out.println("Спортсмен проходит в следующий этап. " + sum);
        else System.out.println("Спортсмен не проходит в следующий этап. " + sum);
    }
}
