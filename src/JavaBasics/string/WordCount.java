package JavaBasics.string;
import java.util.Scanner;

public class WordCount {
    public static void WCount(String str){
        String[] words = str.trim().split("\s+");
        System.out.println("Word Count :"+words.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence :");
        String s = sc.nextLine();
        WCount(s);
    }
}
