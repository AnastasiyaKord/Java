//Задача 2. Реализация стека
//Реализуйте MyStack с использованием LinkedList с методами:
//● push(String element) - добавляет элемент на вершину стека
//● pop() - возвращает элемент с вершины и удаляет его
//● peek() - возвращает элемент с вершины, не удаляя
//● getElements() - возвращает все элементы стека

package java_projects.DZ4_JAVA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

public class Zadacha2 {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public String peek() {
        return stack.peekFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }
}

public class Printer {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {

            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
