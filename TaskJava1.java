/*
1. Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
*/

import java.util.LinkedList;
import java.util.List;

public class TaskJava1 {
    public static List<Integer> reverse(List<Integer> direct) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = direct.size() - 1; i >= 0; i--) {
            reversed.add(direct.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        List<Integer> data = new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            data.add(i);
        }

        System.out.println("Исходный список: " + data);

        List<Integer> revData = reverse(data);
        System.out.println("Перевернутый список: " + revData);
    }
}