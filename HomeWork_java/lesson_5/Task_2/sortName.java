package lesson_5.Task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class sortName {
    public static HashMap<String, String> sort = new HashMap<>();

    public static void main(String[] args) throws IOException {
        rFile(); // Добавить сортировку...

        int col = 0;
        for (String i : sort.keySet()) {
            String[] sur = sort.get(i).split("; ");
            for (String j : sur) {
                System.out.printf("*%s %s;\n", i, j);
                col++;
            }
            System.out.printf("#Кол-во %s = %d\n\n\n", i, col);
            col = 0;
        }
    }

    static void rFile() {
        String fileName = "boy.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while((line = br.readLine()) != null) {
                String[] ns = line.split(" ");

                if (sort.containsKey(ns[0])) {
                    ns[1] = ns[1] + "; " + sort.get(ns[0]);
                    sort.put(ns[0], ns[1]);
                } else sort.put(ns[0], ns[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
