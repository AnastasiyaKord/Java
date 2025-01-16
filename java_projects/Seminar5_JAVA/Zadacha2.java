//Задание №2
//Дана строка. Необходимо написать метод, который отсортирует слова в
//строке по длине с помощью TreeMap. Строки с одинаковой длиной не
//должны “потеряться”.
//Пример строки: Я помню чудное мгновенье Передо мной явилась ты Как
//мимолетное виденье Как гений чистой красоты

package java_projects.Seminar5_JAVA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Zadacha2 {
    public static void main(final String[] args) {
        String s = ": Я помню чудное мгновенье Передо мной явилась ты Как мимолетное виденье Как гений чистой красоты";
        Zadacha2 t = new Zadacha2();
        System.out.println(t.getSortedIncludesWords(s));
    }

    public String getSortedIncludesWords(final String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }
        Map<Integer, List<String>> result = new TreeMap<>();
        List<String> tempList;
        for (String subWord : s.split(" ")) {
            int size = subWord.length();
            if (result.containsKey(size) && !result.get(size).contains(subWord)) {
                tempList = result.get(size);
            } else {
                tempList = new ArrayList<>();
            }
            tempList.add(subWord);
            result.put(size, tempList);
        }
        return result.toString();
    }
}
