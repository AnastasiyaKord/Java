//Дан Deque состоящий из последовательности цифр. Необходимо проверить,
//что последовательность цифр является палиндромом
package java_projects.Seminar4_JAVA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Zadacha0 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 2, 1));
        Zadacha0 task0 = new Zadacha0();
        System.out.println(task0.checkOn(deque));
    }

    public boolean checkOn(Deque<Integer> deque) {
        if (deque == null) {
            throw new IllegalStateException();
        }
        if (deque.size() <= 1) {
            return true;
        }
        while (deque.size() >= 2) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
