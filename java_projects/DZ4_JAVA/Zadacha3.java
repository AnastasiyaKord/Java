//Задача 3. Количество вхождений слова
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список.

package java_projects.DZ4_JAVA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

public class Zadacha3 {
    public static int countOccurrences(LinkedList<String> list, String value) {
        int count = 0;
        for (String s : list) {
            if (s.equals(value)) {
                count++;
            }
        }
        return count;
    }
}

public class Printer {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String value;
        if (args.length < 2) {

            list.add("apple");
            list.add("banana");
            list.add("apple");
            list.add("pear");
            list.add("banana");
            value = "apple";
        } else {
            for (int i = 0; i < args.length - 1; i++) {
                list.add(args[i]);
            }
            value = args[args.length - 1];
        }
        ListUtils utils = new ListUtils();
        System.out.println("Occurrences of \"" + value + "\": " +
                utils.countOccurrences(list, value));
    }
}
