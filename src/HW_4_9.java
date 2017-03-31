import java.util.Random;

/**
 * Created by Александр on 31.03.2017.
 */
public class HW_4_9 {
    public static void main(String args[]) {

        Random random = new Random();

        int mass[] = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(20);
            System.out.print("\t" + mass[i]);
        }

        int mass1[] = mass.clone();
        System.out.println();

        for (int i = 0; i < mass1.length; i++) {
            if ((mass1[i] % 2 == 0) && ((i + 1) % 2 != 0))
                mass1[i] = 0;
            System.out.print("\t" + mass1[i]);
        }

        mass1 = mass.clone();
        System.out.println();

        for (int i = 0; i < mass1.length; i++) {
            if ((mass1[i] % 3 == 0) || (mass1[i] % 5 == 0))
                mass1[i] = 0;
            System.out.print("\t" + mass1[i]);
        }
    }
}
