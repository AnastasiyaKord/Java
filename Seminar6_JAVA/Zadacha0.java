//Задание №0
//1. Напишите метод, который заполнит массив из 1000
//элементов случайными цифрами от 0 до 24.
//2. Создайте метод, в который передайте заполненный выше
//массив и с помощью Set вычислите процент уникальных
//значений в данном массиве и верните его в виде числа с
//плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел *
//100 / общее количество чисел в массиве.

package Seminar6_JAVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Zadacha0 {
    public static void main(String[] args) {
        Zadacha0 task0 = new Zadacha0();
        int[] array = task0.initArray();
        System.out.println(Arrays.toString(array));
        System.out.println(task0.getPercentUniqueValues(array));
    }

    public int[] initArray() {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(24);
        }
        return array;
    }

    public float getPercentUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        System.out.println(set.toString());
        float result = set.size() * (100 / array.length);
        return result;
    }
}
