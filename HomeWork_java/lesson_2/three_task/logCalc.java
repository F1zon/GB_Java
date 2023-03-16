package lesson_2.three_task;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

// 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

public class logCalc {
    public static void main(String[] args) throws IOException {
        double x = 0, y = 0;
        char operation = '+';

        Logger logger = Logger.getLogger(logCalc.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.info("Старт программы...");

        Scanner input = new Scanner(System.in);
        logger.info("Ввод 1 переменной...");
        System.out.printf("Введите 1 число -> ");
        x = input.nextDouble();

        logger.info("Ввод операции...");
        System.out.print("Введите знак -> ");
        operation = input.next().charAt(0);

        logger.info("Ввод 2 переменной...");
        System.out.printf("Введите 2 число -> ");
        y = input.nextDouble();
        input.close();

        logger.info("Выполнение swith...");
        switch (operation) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '/':
                System.out.println(x / y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            default:
                System.out.println("Неверная операция, возможные операции (+ - / *).");
                break;
        }
        logger.info("Конец программы...");
    }
}
