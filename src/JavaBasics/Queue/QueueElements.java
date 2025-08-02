package JavaBasics.Queue;
import java.util.*;

public class QueueElements {
    public static void main(String[] args) {
        System.out.println(" == Queue operations == ");

        //Queue using Linked list
        Queue<String > Q = new LinkedList<>();

        //add
        Q.add("Apple");
        Q.add("orange");
        Q.add("pineapple");
        Q.add("Mango");
        System.out.println("Elements in the queue are :"+Q);

        //offer same as add
        Q.offer("watermelon");
        Q.offer("kiwi");
        System.out.println("Elements in the Queue are :"+Q);

        //peek - views head
        System.out.println("Peek head :"+Q.peek());

        //pool - removes and returns head
        System.out.println("Pool head:"+Q.poll());
        System.out.println("Queue after pool is ;"+Q);

        //remove - Remove and return head
        System.out.println("Remove head:"+Q.remove());
        System.out.println("Queue after remove:"+Q);

        System.out.println("Peek now is :"+Q.peek()); // shows next head cause previous one deleted
        System.out.println("Is the queue empty"+ Q.isEmpty()); //checks if the queue is empty of not

    }
}
