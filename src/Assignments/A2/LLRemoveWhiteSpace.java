package Assignments.A2;
import java.util.*;

public class LLRemoveWhiteSpace {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Hello World");
        strings.add(" Java Programming ");

        System.out.println("Original List:");
        for (String s : strings) {
            System.out.println("'" + s + "'");
        }

        for (int i = 0; i < strings.size(); i++) {
            String cleaned = strings.get(i).replaceAll("\\s+", "");
            strings.set(i, cleaned);
        }

        System.out.println("\nList after removing whitespaces:");
        for (String s : strings) {
            System.out.println("'" + s + "'");
        }
    }
}
