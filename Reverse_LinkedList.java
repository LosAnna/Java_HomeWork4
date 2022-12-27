import java.util.LinkedList;

public class Reverse_LinkedList {
        /**
     * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
     * */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (Integer i : arr) {
            list.add(i);
        }
        System.out.println("Исходный LinkedList:  " + list);
        int i = 0;
        while (i != list.size() - 1) {
            list.add(list.size()-i, list.getFirst());
            list.removeFirst();
            i++;
        }
        
        System.out.println("Перевернутый LinkedList:  " + list);
    }
}
