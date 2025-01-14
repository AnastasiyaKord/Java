//Задача 4*. Среднее значение массива
//Напишите метод, который принимает массив целых чисел и возвращает
//среднее значение элементов массива, округленное до ближайшего целого
//числа.
//Пример:
//[4, 2, 7, 5, 1]
//Результат:
//4

package java_projects.DZ3_JAVA;

import java.util.Arrays;

public class Zadacha4DZ {
    public static int calculateAverage(int[] a) {
        if (a.length == 0)
            return 0;
        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        return (int) Math.round((double) sum / a.length);
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {

            a = new int[] { 4, 2, 7, 5, 1 };
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
