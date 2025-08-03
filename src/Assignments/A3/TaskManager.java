package Assignments.A3;
import java.util.*;

public class TaskManager {

    static LinkedList<String> tasks = new LinkedList<>();

    static void createTask(Scanner sc){
        System.out.print("Enter the task to add: ");
        String newTask = sc.nextLine();
        tasks.add(newTask);
        System.out.println("Task added successfully.");
    }

    static void removetask(Scanner sc){
        System.out.print("Enter the task index to remove (starting from 0): ");
        int removeIndex = sc.nextInt();
        sc.nextLine();
        if (removeIndex >= 0 && removeIndex < tasks.size()) {
            tasks.remove(removeIndex);
            System.out.println("Task removed.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void modifyTask(Scanner sc){
        System.out.print("Enter the task index to modify (starting from 0): ");
        int modifyIndex = sc.nextInt();
        sc.nextLine();
        if (modifyIndex >= 0 && modifyIndex < tasks.size()) {
            System.out.print("Enter the new task: ");
            String modifiedTask = sc.nextLine();
            tasks.set(modifyIndex, modifiedTask);
            System.out.println("Task modified.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    static void listTask(){
        System.out.println("Your Tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Modify Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createTask(sc);
                    break;

                case 2:
                    removetask(sc);
                    break;

                case 3:
                    modifyTask(sc);
                    break;

                case 4:
                    listTask();
                    break;

                case 5:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
