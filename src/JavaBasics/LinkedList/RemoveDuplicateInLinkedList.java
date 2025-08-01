package JavaBasics.LinkedList;
import java.util.*;

public class RemoveDuplicateInLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,1,3,4,5));

        LinkedList<Integer> unique = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(Integer n: list){
            if(set.add(n)){
                unique.add(n); //Only add if not in set
            }
        }
        System.out.println("Original:"+list);
        System.out.println("Without Duplicate:"+unique);
    }
}
