package JavaBasics.Stack;
import java.util.*;

public class StackMethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(" == Stack Operations == ");

        //push operation - push to top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack after elements pushed is:"+stack);

        //peek - shows top of the stack without deleting the top
        System.out.println("Peek top:"+stack.peek());

        //pop - removes the top
        System.out.println("pop top:"+stack.pop());

        System.out.println("is stack empty:"+stack.empty()); //checks if the stack is empty or not

        System.out.println(stack);
        System.out.println("search 10th position:"+stack.search(40)); //search for the elements and print reverse index
    }
}
