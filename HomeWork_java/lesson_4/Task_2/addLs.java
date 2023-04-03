package lesson_4.Task_2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class addLs {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите элементы списка через ',': ");
        str = in.nextLine();
        String[] arr = str.split(", ");

        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }

        while(true) {
            System.out.println("Ваш список: ");
            System.out.println(ll);

            System.out.println("""
                    \t\t<-Команды->
                    1. помещает элемент в конец очереди;
                    2. возвращает первый элемент из очереди и удаляет его;
                    3. возвращает первый элемент из очереди, не удаляя;
                    4. Выход.
                    """);
            
            System.out.printf("Введите номер операции: ");
            int com = in.nextInt();
            while (com < 1 || com > 4) {
                System.out.println("Неверная операция!");
                System.out.printf("Введите номер операции: ");
                com = in.nextInt();
            }

            switch(com) {
                case 1:
                    ll = enqueue(ll);
                    break;
                case 2:
                    ll = dequeue(ll);
                    break;
                case 3:
                    first(ll);
                    break;
                case 4:
                    System.out.println("Выход, пока!");
                    in.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    static LinkedList<String> enqueue(Deque<String> arr) {
        Scanner input = new Scanner(System.in); // с input.close() перестаёт работать программа...
        System.out.print("Введите элемент: ");
        arr.addLast(input.nextLine());

        LinkedList<String> result = new LinkedList<>();
        for (String i : arr) {
            result.add(i);
        }

        return result;
    }

    static LinkedList<String> dequeue(Queue<String> arr) {
        System.out.printf("Первый элемент очереди [%s]\nDeleted...\n\n", arr.remove());
        LinkedList<String> result = new LinkedList<>();

        for (String i : arr) {
            result.add(i);
        }

        return result;
    }

    static String first(Deque<String> arr) {
        System.out.printf("Первый элемент очереди [%s]\n\n", arr.getFirst());
        String result = arr.getFirst();

        return result;
    }
}
