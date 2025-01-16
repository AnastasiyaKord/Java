//Задание №0
//Дана последовательность чисел. Необходимо вернуть сумму
//уникальных чисел
//Пример: [1, 2, 2, 3]
//Результат: 4

package java_projects.Seminar5_JAVA;

import java.util.Arrays;
import java.util.*;

public class Zadacha0 {
    public static void main(final String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3);
        Zadacha0 task0 = new Zadacha0();
        System.out.println(task0.getSumOfUniqueValues(list));
    }

    public Integer getSumOfUniqueValues(final List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int counter = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) == 1) {
                counter = counter + num;
            }
        }

        return counter;
    }
}
