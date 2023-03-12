import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

public class additional {
    public static void main(String[] args) {
        int e = 0;
        int count = 0;
        String q = "", w = "";
        Scanner inp = new Scanner(System.in);
        System.out.println("Заданно уравнение q + w = e");

        System.out.printf("Введите q -> ");
        q = inp.nextLine();
        System.out.printf("Введите w -> ");
        w = inp.nextLine();
        System.out.printf("Введите e -> ");
        e = inp.nextInt();
        inp.close();

        int x = goInt(q, count);
        int y = goInt(w, count);

        if (x + y == e) {
            System.out.printf("%d + %d = %d", x, y, e);
            System.exit(0);
        }

        while (x + y != e) {
            x = goInt(q, count);
            for (int i = 1; i < 10; i++) {
                y = goInt(w, i);
                if (x + y == e) {
                    System.out.printf("%d + %d = %d", x, y, e);
                    System.exit(0);
                }
            }
            count++;
            if (count > 10) {
                System.out.println("Решения нет!");
                System.exit(0);
            }
        }
    }

    static int goInt(String num, int count) {
        String newNum = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '?') {
                newNum += String.valueOf(count);
            } else {
                newNum += num.charAt(i);
            }
        }
        int result = Integer.parseInt(newNum);

        return result;
    }
}
