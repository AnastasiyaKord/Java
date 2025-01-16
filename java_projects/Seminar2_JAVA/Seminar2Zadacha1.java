// Задание№1 
// Дано четное число N(>0)и символы c1 и c2.
// Написать метод,который вернет строку длины N,которая состоит 
// из чередующихся символов c1 и c2,начиная с c1.

package java_projects;

import java.lang.System.Logger;
import java.util.Scanner;

public class Seminar2Zadacha1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        Logger logger = Logger.getLogger(name:"Main");
        String c1;
        String c2;
        int n;
        Logger.info(msg: "Введите значение с1:");
        с1 = scanner.next();
        logger.info(msg:"Введите значение с2:");
        с2 = scanner.next();
        logger.info(msg:"Введите значение N:");
        n = scanner.next();

        if (n<=0){
            throw new Exception("Не валидное значение N");
        }
        for (int i = 0; i < n; i++) {
            if(i%2 == 0) {
                System.out.print(c1);
            }
            if (i % 2 == 1) {
                System.out.print(c2);
            }
        }
    }

}
