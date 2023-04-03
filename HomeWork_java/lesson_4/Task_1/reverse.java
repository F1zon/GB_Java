import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class reverse {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите элементы списка через ',': ");
        str = in.nextLine();
        String[] arr = str.split(", ");
        in.close();

        LinkedList<String> ll = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }

        ll = rev(ll);
        System.out.println(ll);
    }

    static LinkedList<String> rev(Deque<String> arr) {
        LinkedList<String> result = new LinkedList<>();
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            result.add(arr.getLast());
            arr.removeLast();
        }

        return result;
    }
}