package JavaBasics.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListPalindrome {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,3,2,1));
        boolean isp = true;
        int i = 0,j = list.size()-1;
        while (i<j){
            if(!list.get(i).equals(list.get(j))){
                isp = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("is the list palindrome:"+isp);
    }
}
