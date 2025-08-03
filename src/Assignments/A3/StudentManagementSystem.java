package Assignments.A3;
import java.util.*;

public class StudentManagementSystem {
    static  LinkedList<String[]> students = new LinkedList<>();

    static void addStudent(Scanner sc){
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        students.add(new String[]{id, name, dept});
        System.out.println("Student added.");
    }

    static void removeStudent(Scanner sc){
        System.out.print("Enter Student ID to remove: ");
        String removeId = sc.nextLine();
        boolean removed = students.removeIf(s -> s[0].equals(removeId));
        System.out.println(removed ? "Student removed." : "Student not found.");
    }

    static void listStudents(){
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student List:");
            for (String[] s : students) {
                System.out.println("ID: " + s[0] + ", Name: " + s[1] + ", Department: " + s[2]);
            }
        }
    }

    static void modifyDetails(Scanner sc){
        System.out.print("Enter Student ID to modify: ");
        String modifyId = sc.nextLine();
        boolean modified = false;
        for (String[] s : students) {
            if (s[0].equals(modifyId)) {
                System.out.print("Enter new name: ");
                s[1] = sc.nextLine();
                System.out.print("Enter new department: ");
                s[2] = sc.nextLine();
                System.out.println("Student details updated.");
                modified = true;
                break;
            }
        }
        if (!modified) {
            System.out.println("Student not found.");
        }
    }

    static void searchStudent(Scanner sc){
        System.out.print("Enter Student ID to search: ");
        String searchId = sc.nextLine();
        boolean found = false;
        for (String[] s : students) {
            if (s[0].equals(searchId)) {
                System.out.println("Student Found -> ID: " + s[0] + ", Name: " + s[1] + ", Department: " + s[2]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. List Students");
            System.out.println("4. Modify Student");
            System.out.println("5. Search Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    removeStudent(sc);
                    break;

                case 3:
                    listStudents();
                    break;

                case 4:
                    modifyDetails(sc);
                    break;

                case 5:
                    searchStudent(sc);
                    break;

                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
