import java.util.HashMap;
import java.util.Scanner;

public class phoneBook {
    public static HashMap<String, String> book = new HashMap<>();
    public static String surname = "";
    public static String phone = "";


    public static void main(String[] args) {
        System.out.printf("\t\t Телефонная книга.exe");
        System.out.println("""
                Функции:
                1. Добавить
                2. Вывести всё
                3. Выйти
                """);

        while(true) {
            work();
        }
    }

    static void work() {
        Scanner in = new Scanner(System.in);
        int op = 0;

        System.out.println("Введите операцию: ");
        op = in.nextInt();

        switch(op) {
            case 1:
                addBook();
                break;
            case 2:
                output();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Неверная операция!");
                break;
        }
    }

    static void addBook() {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите фамилию: ");
        surname = in.nextLine();
        System.out.printf("Введите номер: ");
        phone = in.nextLine();

        if (book.containsKey(surname)) {
            phone = book.get(surname) + ", " + phone;
        }

        book.put(surname, phone);
    }

    static void output() {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите фамилию: ");
        surname = in.nextLine();
        phone = book.get(surname);
        
        System.out.printf("Ваш запрос - %s: %s\n\n", surname, phone);
    }
}