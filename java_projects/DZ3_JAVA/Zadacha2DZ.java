//Задача 2. Уникальные числа
//Напишите метод, который принимает целочисленный массив и возвращает
//новый массив, содержащий только уникальные элементы из исходного
//массива.
//Пример:
//[1, 2, 2, 3, 4, 4, 5]
//Результат:
//[1, 2, 3, 4, 5]

package java_projects.DZ3_JAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class Zadacha2DZ {
    public static int[] getUniqueElements(int[] a) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        // Преобразуем ArrayList в массив
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[] { 1, 2, 2, 3, 4, 4, 5 };
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
