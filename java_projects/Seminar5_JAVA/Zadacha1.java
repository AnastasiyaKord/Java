//Задание №1
//Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что
//существует прямой путь, идущий от ”Город А” до“Город Б”. Верните
//город назначения, то есть город без какого-либо пути, ведущего в
//другой город.
//Пример: [["Москва","Самара"],["Курск","Пенза"],["Самара","Курск"]]
//Результат: Пенза

package java_projects.Seminar5_JAVA;

import java.util.*;

public class Zadacha1 {
    public static void main(final String[] args) {
        Map<String, String> path = new HashMap<>();
        path.put("Москва", "Самара");
        path.put("Курск", "Пенза");
        path.put("Самара", "Курск");
        Zadacha1 t = new Zadacha1();
        System.out.println(t.getFinalCity(path));
    }

    public String getFinalCity(Map<String, String> path) {
        for (String end : path.values()) {
            if (!path.containsKey(end)) {
                return end;
            }
        }
        return null;
    }
}
