package lesson_3.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class search {
    public static void main(String[] args) {
        String numbers;
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите числа через пробел: ");
        numbers = in.nextLine();
        in.close();

        List<String> arr = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        List<Integer> num = new ArrayList<>();
        for (String item : arr) num.add(Integer.parseInt(item));

        System.out.printf("min = %d\nmax = %d\narithmetic mean = %d\n", listMin(num), listMax(num), listArifMean(num));
    }

    static int listMin(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(0);
    }

    static int listMax(List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size() - 1;
        return arr.get(n);
    }

    static int listArifMean(List<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        for (int item : arr) sum += item;

        return sum / n;
    }
}
