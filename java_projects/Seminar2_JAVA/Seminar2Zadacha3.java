// Задание №3
// Посчитайте сколько ’’драгоценных камней’’ в куче ’’обычных
// камней’’
// Пример: jewels = “aB”, stones = “aaaAbbbB”
// Результат: ”a3B1”package java_projects;

import java.util.Scanner;
import java.util.logging.Logger;

public class Seminar2Zadacha3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Main");
        logger.info("Введите значения драгоценностей");
        String jawels = scanner.next();
        logger.info("Введите строку содержащую обычные камни");
        String stones = scanner.next();
        if (jawels.length() == 0) {
            throw new Exception("Не введен ни один символ соответствующий драгоценности");
        }
        if (jawels.length() == 0) {
            throw new Exception("Не введен ни один символ соответствующий кучи обычных камней");
        }

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char c1 : jawels.toCharArray()) {
            if (c1 == c2) {
                counter++;
            }
        }
        sb.append(c1)
                .append(":")
                .append(counter)
                .append(" ");
        counter = 0;
    }
    logger.info(sb.toString());
}
