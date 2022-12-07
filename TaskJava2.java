/*
 2. Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.
 */

import java.util.LinkedList;

@SuppressWarnings("ALL")
public class TaskJava2 {
    private static final LinkedList<Integer> queue = new LinkedList<>();

    public static void enqueue(int value) {
        TaskJava2.queue.offerLast(value);
    }

    public static int dequeue() {
        return queue.pollFirst();
    }

    public static int first() {
        return queue.peekFirst();
    }

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            enqueue(i);
            System.out.println("Добавлен элемент: " + (i));
            System.out.println("Очередь: " + queue);
        }

        System.out.println("Удаляем: " + dequeue());
        System.out.println("Первый элемент: " + first());
        System.out.println("Очередь: " + queue);

    }
}