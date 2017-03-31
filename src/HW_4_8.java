import java.util.Random;
import java.util.Scanner;

/**
 * Created by Александр on 31.03.2017.
 */
public class HW_4_8 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Выберите число n1 и n2, причём(n2 >= n1)");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int mass[] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20) - 10;
            System.out.print("\t" + mass[i]);
        }

        int mass1[] = mass.clone();

        System.out.println("\n\nЗдесь все значения меньше 0 заменяем нулями.");
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] <= 0)
                mass1[i] = 0;
            System.out.print("\t" + mass1[i] + " ");
        }

        mass1 = mass.clone();

        System.out.println("\n\nЗдесь все значения больше чем n1 заменяем нулями.");
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] > n1) mass1[i] = 0;
            System.out.print("\t" + mass1[i] + " ");
        }

        mass1 = mass.clone();

        System.out.println("\n\nЗдесь все значения больше чем n1 и меньше чем n2 заменяем нулями.");
        for (int i = 0; i < mass1.length; i++) {
            if (mass1[i] > n1 && mass1[i] < n2) mass1[i] = 0;
            System.out.print("\t" + mass1[i] + " ");
        }
    }
}
