// Задача 3. Удаление пустых строк из текста
// Дана строка с несколькими строками текста, разделенными переводами строки.
// Напишите метод, который удаляет все пустые строки из текста.

package java_projects.DZ2_JAVA;

public class Zadacha3DZ {
    public static String removeEmptyLines(String text) {
        String[] lines = text.split("\n");
        StringBuilder cleanedText = new StringBuilder();
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                if (cleanedText.length() > 0) {
                    cleanedText.append("\n");
                }
                cleanedText.append(line);
            }
        }
        return cleanedText.toString();
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран
// и проверки

public class Printer {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}
