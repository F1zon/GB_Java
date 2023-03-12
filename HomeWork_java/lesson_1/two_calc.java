import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class two_calc {
    public static void main(String[] args) throws Exception{
        double x = 0, y = 0;
        char operation = '+';

        Scanner input = new Scanner(System.in);
        System.out.printf("Введите 1 число -> ");
        x = input.nextDouble();

        System.out.print("Введите знак -> ");
        operation = input.next().charAt(0);

        System.out.printf("Введите 2 число -> ");
        y = input.nextDouble();
        input.close();

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
    }
}
