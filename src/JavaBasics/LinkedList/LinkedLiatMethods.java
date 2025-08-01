package JavaBasics.LinkedList;
import java.util.*;

public class LinkedLiatMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Add Methods
        list.add("Apple"); //add at the last
        list.addFirst("Banana"); //add at the beginning
        list.addLast("Orange"); //add at the end
        list.add(1,"Mango"); //add at specific index

        //Offer methods similar to add but return boolean
        System.out.println(list.offer("Pineapple")); //Adds  to tail
        list.offerFirst("kivi"); //adds at head
        list.offerLast("Orange"); //adds at tail

        //Get methods
        System.out.println("Get at index 2:"+list.get(2)); //get by index
        System.out.println("First:"+list.getFirst()); //First element
        System.out.println("Last:"+list.getLast()); //Lat element
        System.out.println("Peek:"+list.peek()); //Head no removal
        System.out.println("Peek First:"+list.peekFirst()); //same as peek
        System.out.println("peek Last:"+list.peekLast()); //last element

        //Remove Methods
        list.remove(); //remove Head
        list.remove(2); //remove at index
        list.removeFirst(); //remove head
        list.removeLast(); //remove last

        //poll Methods
        System.out.println("Poll"+list.poll()); //remove Head
        System.out.println("Poll First:"+list.pollFirst()); //Remove First
        System.out.println("Poll Last:"+list.pollLast()); //Remove Last

        //contains / Index Method
        list.add("kiwi");
        list.add("Apple");
        list.add("mango");

        System.out.println("Contains Mango:"+list.contains("mango"));
        System.out.println("Index of Apple:"+list.indexOf("Apple"));
        System.out.println("Last index of kiwi:"+list.lastIndexOf("Kiwi"));

        //size & Empty
        System.out.println("Size of list is:"+list.size());
        System.out.println("Is list empty:"+list.remove());

        //Set/update
        list.set(1,"Papaya"); //replace element at index 1
        System.out.println("After set of index 1:"+list);

        //Traversal
        System.out.println("traversal using for-each");
        for(String f:list){
            System.out.println(f);
        }

        System.out.println("traversal using iterator:");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\nTraversal in reverse using descending iterator");
        Iterator<String> revItr = list.descendingIterator();
        while(revItr.hasNext()){
            System.out.println(revItr.next());
        }

        //Stack Methods
        list.push("Strawberry"); //push to head(stack)
        System.out.println("After push:"+list);

        String popped = list.pop(); //pop from head (stack)
        System.out.println("Popped is:"+popped);
        System.out.println("List after pop is:"+list);
        
        //Bulk Operations
        LinkedList<String> extra = new LinkedList<>();
        extra.add("Lychee");
        extra.add("peach");

        list.addAll(extra); // Add all from another list
        System.out.println("After addAll:"+list);

        //convert the list to array
        Object[] arr = list.toArray();
        System.out.println("Cobverted array is:");
        for(Object obj:arr){
            System.out.println(obj);
        }

        list.clear(); //clear all elements
        System.out.println("Is the list Empty:"+list.isEmpty());


    }
}
