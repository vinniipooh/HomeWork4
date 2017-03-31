/**
 * Created by Александр on 31.03.2017.
 */
public class HW_4_6 {
    public static void main(String args[]) {
        int mass[] = {9, 14, 54, 99, 45, 12, 56, 2, 5};
        int max = mass[1];
        int min = mass[1];

        for (int a : mass)
            System.out.print("\t" + a + " ");

        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            if (max < mass[i]) max = mass[i];
            if (min > mass[i]) min = mass[i];
        }

        for (int j = 0; j < mass.length; j++) {
            if (mass[j] == max || mass[j] == min) mass[j] = 0;
        }

        for (int a : mass)
            System.out.print("\t" + a + " ");
    }
}
