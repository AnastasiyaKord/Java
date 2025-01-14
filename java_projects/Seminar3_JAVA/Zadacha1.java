//Задание №1
//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.

package java_projects.Seminar3_JAVA;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadacha1 {
    // Дан список с десятью случайными числами, нужно отсортировать
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        Zadacha1 task1 = new Zadacha1();
        System.out.println(task1.sortByCollections(list).toString());
        System.out.println(task1.sortByComparator(list).toString());
    }

    public List<Integer> sortByCollections(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public List<Integer> sortByComparator(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
