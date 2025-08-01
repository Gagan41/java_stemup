package JavaBasics.LinkedList;
import java.util.LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i=0; i<=7; i++){
            list.add(i);
        }

        // two pinter
        int slow = 0, fast = 0;
        while (fast < list.size()-1 && fast + 1 < list.size() - 1){ //0<6 && 1<6
            slow++;
            fast += 2;
        }
        System.out.println("Middle Element index :"+list.get(slow));
    }
}
