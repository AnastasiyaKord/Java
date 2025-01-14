//Задача 4*. Нахождение максимального из трех чисел
//Реализуйте две функции:
//1. Функция findMaxOfTwo должна принимать два числа и возвращать
//максимальное из них, используя только знак сравнения.
//2. Функция findMaxOfThree должна принимать три числа и находить
//максимальное из них, используя первую функцию.

package java_projects.DZ_JAVA;

public class Zadacha4DZ {
    public int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public int findMaxOfThree(int a, int b, int c) {
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}

public class Printer {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }

        Answer ans = new Answer();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res);
    }
}