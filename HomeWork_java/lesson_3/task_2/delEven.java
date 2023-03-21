package lesson_3.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class delEven {
    public static void main(String[] args) {
        String numbers;
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите числа через пробел: ");
        numbers = in.nextLine();
        in.close();

        List<String> arr = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        List<Integer> num = new ArrayList<>();
        int temp;

        for (String item : arr) {
            temp = Integer.parseInt(item);
            if (temp % 2 != 0) num.add(Integer.parseInt(item));
        }

        for (int item : num) System.out.printf("%d ", item);
    }
}
