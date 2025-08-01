package JavaBasics.LinkedList;
import java.util.*;

public class Prob2 {
    static void PrintLinkedList(LinkedList<Integer> l){
        System.out.println("Printing th Linked List ");
        Iterator<Integer> itr=l.iterator();

        while(itr.hasNext()){
            System.out.print (itr.next()+ " ");
        }
        System.out.println("");
    }


    static void Problem2(LinkedList<Integer> l){
        Scanner sc=new Scanner(System.in);
        while(l.size()<5){
            System.out.print("Enter the Element :");
            l.add(sc.nextInt());
            System.out.println("Element "+l.peekLast()+" Added SuccusFully to the index "+ l.size());
        }
        Collections.sort(l);
        Collections.reverse(l);
        PrintLinkedList(l);

        System.out.println("what to replace just give the Element and Replacer Element : ");
        int r1= sc.nextInt();
        int r2=sc.nextInt();
        Replace(l,r1,r2);
        PrintLinkedList(l);

        System.out.println("The Size is : "+l.size());

        LinkedList<Integer> l2=new LinkedList<>(Arrays.asList(0,9,1,4,5,2,5,7));

        System.out.println("Merging the Elements .... ");
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Add all elements from list1 and list2
        mergedList.addAll(l);
        mergedList.addAll(l2);

        System.out.println("The Mewged List is : ");
        PrintLinkedList(mergedList);

        Collections.sort(mergedList);
        System.out.println("The Mewged List after Sorting is : ");
        PrintLinkedList(mergedList);

        LinkedList<Integer> unique = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(Integer n: mergedList){
            if(set.add(n)){
                unique.add(n); //Only add if not in set
            }
        }
        System.out.println("Original:"+mergedList);
        System.out.println("Without Duplicate:"+unique);

        Collections.reverse(unique);
        System.out.println("After reversing the unique Values");

    }

    static void Replace(LinkedList<Integer> l,int replaceable ,int replacer){
        int idx= l.indexOf(replaceable);
        l.set(idx,replacer);
        System.out.println("Succusfully Replace the Element ");

    }
    public static void main(String[] args) {
        LinkedList<Integer> r=new LinkedList<>();
        Problem2(r);
    }
}

