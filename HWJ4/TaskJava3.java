package HWJ4;

/*
3. 1) Написать метод, который принимает массив элементов,
помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов,
помещает их в очередь и выводит на консоль содержимое очереди.
*/

import java.util.LinkedList;

public class TaskJava3 {
    public static void main(String[] args) {
        Object[] arr = {19, "dad", "mom", 79};
        getForStack(arr);
        getForQue(arr);
    }

    static void getForStack(Object[] arr) {
        LinkedList<Object> linkList = new LinkedList<>();
        for (Object o : arr) {
            linkList.push(o);
        }
        linkList.pop();
        System.out.println(linkList);
    }

    static void getForQue(Object[] arr) {
        LinkedList<Object> que = new LinkedList<>();
        for (Object o : arr) {
            que.offer(o);
        }
        que.poll();
        System.out.println(que);
    }
}