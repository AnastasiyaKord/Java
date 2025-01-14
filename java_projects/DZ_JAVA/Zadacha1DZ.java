// Задание 1. Нахождение факториала числа
//Напишите метод factorial, который принимает число n и возвращает его
//факториал. Если число n < 0, метод должен вернуть -1.

package java_projects.DZ_JAVA;

public class Zadacha1DZ {

    public int factorial(int n) {

        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Printer {

    public static void main(String[] args) {
        int n = 5;

        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}
