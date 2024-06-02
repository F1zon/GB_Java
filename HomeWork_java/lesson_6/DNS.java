import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализицая магазина техники для 
 * класса {@link NoteBook}
 * 
 * @author Nikita korolev
 * @version 1.0
 */
public class DNS {
    private static Map<Integer, NoteBook> notes;
    private static List<NoteBook> resultes;
    private static List<String> filters;
    private static List<String> filtersResult;
    private static Scanner sc;
    private static NoteBook test;

    /**
     * Метод генерирует рандомное заполнение 6 ноутбуков.
     */
    private static void generade() {
        Random random = new Random();
        List<String> os = new ArrayList<>(Arrays.asList("Windows", "Linux"));        
        List<String> color = new ArrayList<>(Arrays.asList("Red", "White", "Black", "Silver"));
        List<String> ozu = new ArrayList<>(Arrays.asList("4", "8", "16"));
        List<String> shd = new ArrayList<>(Arrays.asList("256", "512", "1"));

        System.out.println("Ноутбуки в наличии:");
        for (int i = 0; i < 6; i++) {
            notes.put(i, 
                new NoteBook(ozu.get(random.nextInt(3)), shd.get(random.nextInt(3)), 
                os.get(random.nextInt(2)), color.get(random.nextInt(4))));

            System.out.println(notes.get(i));
        }
    }

    /**
     * Метод находит актуальные ноутбуки
     * по заполненному фильтру, дополнительный параметр test.
     */
    private static void sorted() {
        resultes = new LinkedList<>();
        NoteBook tmp = new NoteBook();
        for (int i = 0; i < notes.size(); i++) {
            tmp = notes.get(i);

            if (Integer.valueOf(tmp.getOzu()) >= Integer.valueOf(test.getOzu()) && 
                Integer.valueOf(tmp.getShd()) >= Integer.valueOf(test.getShd()) &&
                tmp.getOs().equals(test.getOs()) &&
                tmp.getColor().equals(test.getColor())) {
                resultes.add(tmp);
            }
            
        }

    }

    /**
     * Вывод полученных в результате сортировке ноутбуки.
     */
    private static void output() {
        for (NoteBook n : resultes) {
            System.out.println(n.toString());
        }
    }

    /** 
     * Основной метод, реализация консольного 
     * интерфейса магазина.
    */
    public static void main(String[] args) {
        notes = new HashMap<>();
        sc = new Scanner(System.in);
        filters = new LinkedList<>(Arrays.asList("ozu", "hard drive", "os", "color"));
        filtersResult = new LinkedList<>();
        generade();

        System.out.println();
        System.out.println("Введите минимальные требования:");
        for (String s : filters) {
            System.out.print("enter " + s + ":>> ");
            filtersResult.addLast(sc.nextLine());
        }

        test = new NoteBook(filtersResult.get(0), filtersResult.get(1), 
        filtersResult.get(2), filtersResult.get(3));
        sorted();
        output();
    }
}
