package JavaBasics.LinkedList;

import java.util.*;

public class Prob1 {
    static void PrintLinkedList(LinkedList<Integer> l){
        System.out.println("Printing the Linked List ");
        Iterator<Integer> itr=l.iterator();

        while(itr.hasNext()){
            System.out.print (itr.next()+ " ");
        }
        System.out.println("");
    }

    static void ProblemMethod(LinkedList<Integer> l){
        System.out.println("Before Adding");
        PrintLinkedList(l);
        while(l.size()<10){
            l.add(l.size()+1);
        }
        System.out.println("After Adding ");
        PrintLinkedList(l);
        //add ele  in Front
        System.out.println("add last");
        l.add(11);
        PrintLinkedList(l);

        //remove from first
        System.out.println("remove First");
        l.removeFirst();
        PrintLinkedList(l);

        if(l.contains(7)){
            System.out.println("The Index number is : "+l.indexOf(7));
        }

        //Adding 11111 at index 5
        l.add(5,11111);
        PrintLinkedList(l);

        Collections.sort(l);
        System.out.println("Linked list after sorting is:");
        PrintLinkedList(l);

        System.out.println("Traversal using iterator:");
        Iterator<Integer> itr = l.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println("Removes duplicates uing hashset");
        LinkedList<Integer> unq = new LinkedList<>();
        HashSet<Integer> newH = new HashSet<>();
        for(Integer n:l){
            if(newH.add(n)){
                unq.add(n);
            }
        }
        System.out.println("Linked list after removing duplicates is:"+unq);

        Iterator<Integer> ritr = l.descendingIterator();
        while(ritr.hasNext()){
            System.out.print(ritr.next()+" ");
        }

        //clearing teh contents of linked list
        l.clear();

        System.out.println("is the linked list empty:"+l.isEmpty());
        if(l.isEmpty()) System.out.println("Date deleted sucessfully");

    }
    public static void main(String[] args) {
        LinkedList<Integer> m=new LinkedList<>(Arrays.asList(1,2,3,9,3,4,5,6,6,0,7));
        ProblemMethod(m);
    }
}
