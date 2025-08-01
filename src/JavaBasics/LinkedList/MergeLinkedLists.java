package JavaBasics.LinkedList;
import java.util.*;

public class MergeLinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(5, 6, 7, 8));

        // Create a new linked list to store the merged result
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Add all elements from list1 and list2
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Print the merged list
        System.out.println("Merged Linked List: " + mergedList);
    }
}
