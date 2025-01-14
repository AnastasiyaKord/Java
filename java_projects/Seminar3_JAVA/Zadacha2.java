//Задание №2
//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа.

package java_projects.Seminar3_JAVA;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Zadacha2 {
    // Дан список содержащий строки и числа в строковом формате.
    // С помощью итератора пройти по списку и вывести в консоль что является
    // строкой, а что числом
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        Zadacha2 task2 = new Zadacha2();
        task2.printResultOfCheck(list);
    }

    public void printResultOfCheck(List<String> list) {
        for (String s : list) {
            try {
                int i = Integer.valueOf(s);
                System.out.println(i + "-число");
            } catch (NumberFormatException e) {
                System.out.println(s + "-строка");
            }
        }
    }
}
