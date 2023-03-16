import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.*;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class one {
    public static void main(String[] args) throws IOException {
        String arr = "";
        Scanner in = new Scanner(System.in);

        Logger logger = Logger.getLogger(one.class.getName());
        FileHandler fh = new FileHandler("logger.txt");
        logger.addHandler(fh);

        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.info("Страт работы программы");

        System.out.printf("Введите числа через пробел: ");
        logger.info("Ввод массива");
        arr = in.nextLine();
        in.close();

        String[] num = arr.split(" ");
        int[] res = new int[num.length];

        for (int i = 0; i < num.length; i++) res[i] = Integer.parseInt(num[i]);

        int temp = 0;
        for (int i = 1; i < res.length; i++) {
            if (res[i] < res[i - 1]) {
                temp = res[i - 1];
                res[i - 1] = res[i];
                res[i] = temp;
                i = 0;
                logger.info("Замена чисел массива...");
            }
        }

        System.out.println("Отсортированный массив: ");
        logger.info("Ввывод результата...");
        for (int el : res) System.out.printf("%d ", el);
    }
}