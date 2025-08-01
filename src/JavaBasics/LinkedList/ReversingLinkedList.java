package JavaBasics.LinkedList;
import java.util.Collections;
import java.util.LinkedList;

public class ReversingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original list is:"+list);

        //Reverse using Collections
        Collections.reverse(list);
        System.out.println("Reversed list is :"+list);

        //sorting
        Collections.sort(list);
        System.out.println("Sorted list is:"+list);
    }
}
