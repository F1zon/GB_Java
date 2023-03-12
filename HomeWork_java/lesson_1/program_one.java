import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class program_one {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Введите n: ");
        int n = inp.nextInt();
        inp.close();

        System.out.printf("треугольное число = %d\n", trianNumber(n));
        System.out.printf("n! = %d\n", factorial(n));
    }

    static int trianNumber(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}