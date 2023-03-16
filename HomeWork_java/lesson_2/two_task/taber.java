package lesson_2.two_task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class taber {
    public static void main(String[] args) throws IOException {
        String file_name = "data.txt";
        File f = new File(file_name);

        if (f.exists()) {
            System.out.println("File exist...");
        } else {
            System.out.println("File not exist...");
            System.exit(1);
        }

        String line;
        String[] arr;
        String[] word = {"Студент ", " получил ", " по предмету "};
        int j = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            while ((line = br.readLine()) != null) {
                StringBuilder builder = new StringBuilder();
                arr = new String[line.length()];
                arr = line.split(", ");

                for (int i = 0; i < word.length; i++) {
                    builder.append(word[i]);
                    builder.append(arr[j]);
                    j += 2;
                }
        
                j = 1;
                String result = builder.toString();
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}