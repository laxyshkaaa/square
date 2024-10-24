import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10000];


        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
        }

        int maximum = 0;
        int maxINPast = 0; // Переменная для хранения максимального элемента на расстоянии >= 10

        for (int i = 10; i < mass.length; i++) {

            maxINPast = Math.max(maxINPast, mass[i - 10]);


            int summa = mass[i] * mass[i] + maxINPast * maxINPast;


            if (summa > maximum) {
                maximum = summa;
            }
        }


        System.out.println("Максимальная сумма квадратов: " + maximum);
    }
}
