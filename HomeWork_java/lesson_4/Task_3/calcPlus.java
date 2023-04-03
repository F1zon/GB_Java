package lesson_4.Task_3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

// Пример отработанной программы
// 5
// *
// 3
// Ответ = 15

// +
// 2
// Ответ = 17

public class calcPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<String> example = new LinkedList<>();
        int result = 0;
        String next;

        System.out.println("""
                \t\t   Калькулятор 3000
                \t\t!!!Построчный ввод!!!
                Дополнительные функции (Выполняються после 1 ввода 1 примера!!):
                exit - Выйти из программы.
                cance - отменить последнюю операцию, ввод начинается с операции(+, - и т.д.)
                """);
        
        for (int i = 0; i < 3; i++) {
            next = in.nextLine(); 
            example.add(next);
        }

        result = oper(example);
        System.out.printf("Ответ = %d\n\n", result);
        Deque<String> temp = new LinkedList<>();
        temp.add(example.getFirst());

        example = cls(example);
        example.add(Integer.toString(result));

        while(true) {
            for (int i = 0; i < 2; i++) {
                next = in.nextLine();
                example.add(next);
                example = listener(example, temp, next);
                if (example.getLast() == "0") {
                    example.removeLast();
                    i--;
                }
            }

            result = oper(example);
            System.out.printf("Ответ = %d\n\n", result);
            example = cls(example);
            example.add(Integer.toString(result));
        }
    }

    static int oper(Deque<String> arr) {
        int result = 0;
        int one = Integer.parseInt(arr.getFirst());
        int two = Integer.parseInt(arr.getLast());
        arr.removeLast();
        
        switch (arr.getLast()) {
            case "+":
                result = one + two;
                break;
            case "-":
                result = one - two;
                break;
            case "*":
                result = one * two;
                break;
            case "/":
                result = one / two;
                break;
            default:
                break;
        }

        return result;
    }

    static  Deque<String> cls(Deque<String> arr) {
        for (int i = 0; i < 2; i++) arr.remove();
        return arr;
    }

    static  Deque<String> listener(Deque<String> arr, Deque<String> temp, String op) {
        switch (op) {
            case "exit":
                System.out.println("Пока!");
                System.exit(0);
                break;
            case "cance":
                temp.add("0");
                return temp;
            default:
                break;
        }

        return arr;
    }
}
