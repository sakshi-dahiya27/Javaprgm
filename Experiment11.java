import java.util.*;

class Task {
    int id;
    String title;

    Task(int id, String title) {
        this.id = id;
        this.title = title;
    }
}

public class Experiment11 {
    static List<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add \n 2. View \n 3. Update \n 4. Delete \n 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> updateTask();
                case 4 -> deleteTask();
                case 5 -> System.exit(0);
            }
        }
    }

    static void addTask() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        tasks.add(new Task(id, title));
    }

    static void viewTasks() {
        for (Task t : tasks) {
            System.out.println(t.id + ": " + t.title);
        }
    }

    static void updateTask() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Task t : tasks) {
            if (t.id == id) {
                System.out.print("New Title: ");
                t.title = sc.nextLine();
                break;
            }
        }
    }

    static void deleteTask() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        tasks.removeIf(t -> t.id == id);
    }
}