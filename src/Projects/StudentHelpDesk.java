package Projects;
import java.util.*;

public class StudentHelpDesk {

    static Queue<String> Q = new LinkedList<>();
    static Stack<String> S = new Stack<>();
    static LinkedList<String> l = new LinkedList<>();
    static String [] Queries = new String[100];
    static int qCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n Student help desk ");
            System.out.println("1. Submit a query");
            System.out.println("2, View and resolve next query");
            System.out.println("3. View resent keyword");
            System.out.println("4, undo last key word");
            System.out.println("5. View all FAQ's");
            System.out.println("6. Add an FAQ");
            System.out.println("7. Remove an FAQ");
            System.out.println("8. Exit");
            System.out.print("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    submitQuery(sc);
                    break;
                case 2:
                    resolveQuery();
                    break;
                case 3:
                    viewRecentKeyword();
                    break;
                case 4:
                    undoKeyword();
                    break;
                case 5:
                    viewFAQs();
                    break;
                case 6:
                    addFAQs(sc);
                    break;
                case 7:
                    removeFAQs(sc);
                    break;
                case 8:
                    System.out.println("Exiting system , Thank you:");
            }
        } while (choice != 8);
        sc.close();
    }

    //submitting a new query
    static void submitQuery(Scanner sc){
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("enter your email;");
        String email = sc.nextLine();

        if(!email.contains("@") && !email.endsWith(".com")){
            System.out.println("Invalid email format");
            return;
        }

        System.out.print("Enter your Query;");
        String query = sc.nextLine();

        Queries[qCount++] = query; //store in array
        Q.offer("From: "+name+", Email: "+email+"| Query: "+query); //Add to queue

        //Extract Keyword split by space
        String [] words = query.split(" ");
        for(String word: words){
            if(word.length()>3){
                S.push(word.toLowerCase());
            }
        }
        System.out.println("Query Submitted Successfully:");
    }

    static void resolveQuery(){
        if(Q.isEmpty()){
            System.out.println("No queries to resolve:");
        }
        else{
            String resolved = Q.poll(); //Remove head
            System.out.println("Resolved Query:"+resolved);
        }
    }

    static void viewRecentKeyword(){
        if(S.isEmpty()){
            System.out.println("No key words yet:");
        }
        else{
            System.out.println("Recent keyword is :"+S.peek());
        }
    }

    //undoing last keyword
    static void undoKeyword(){
        if (S.isEmpty()){
            System.out.println("No Keywords to undo");
        }
        else{
            System.out.println("removed keyword:"+S.pop());        }
    }

    //Viewing all FAQ
    static void viewFAQs(){
        if(l.isEmpty()){
            System.out.println("No FAQs available");
        }
        else {
            System.out.println("FAQs are");
            for(String s: l){
                System.out.println("- "+s);
            }
        }
    }

    static void addFAQs(Scanner sc){
        System.out.println("Enter the FAQ to add:");
        String faq = sc.nextLine();
        l.add(faq);
        System.out.println("FAQ added");

    }

    static void removeFAQs(Scanner sc){
        System.out.println("ALL available FAQ are:"+l);
        System.out.print("Enter the index of the FAQ to be removed :");
        int index = sc.nextInt();
        System.out.println("FAQs After removed is :"+ l.remove(index));
        System.out.println("Available FAQs are :"+l);
    }

}
