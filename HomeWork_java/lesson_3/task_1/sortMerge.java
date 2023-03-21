package lesson_3.task_1;

import java.util.Scanner;

// Не дописал сортировку, не совсем понимаю, как мне реалтзовать методом рекурсии деления массива на под массивы

public class sortMerge {
    public static void main(String[] args) {
        String numbers;
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите числа через пробел: ");
        numbers = in.nextLine();
        in.close();

        String[] num_str = numbers.split(" ");
        int[] num = new int[num_str.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(num_str[i]);
        }

        merge(num, 0, num.length);
    }

    // IN PROGRESS...
    static void merge(int[] arr, int start, int end) {
        if (end < 2) return;
        if (end == 2) {
                int temp = arr[start];
                arr[start] = arr[end - 1];
                arr[end - 1] = temp;
        }

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
