package java_projects;

import java.util.Scanner;

public class Seminar1Zadacha5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double с = Math.pow(a, b); // использование системных джава утилит , которые уже предреализованны
                                   // (использование библиотеки МАФ)
        System.out.print(с);

        // int с = pow(a, b); относится к решению с помощью рекурсии
        // System.out.print(с); относится к решению с помощью рекурсии
    }

    // решение с помощью цикла
    // int result = 1;
    // for (int i = 1; i <= b; i++) {
    // result = result * a;
    // }
    // System.out.print(result);

    // решение с помощью рекурсии
    // public static int pow(int a, int b) {
    // if (b == 1) {
    // return a;
    // } else {
    // return a * pow(a, b - 1);
    // }
    // }
}
