import java.util.Scanner;

public class DailyRoutinesProject {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DailyRoutine dailyRoutine = new DailyRoutine();

        System.out.println("Welcome to Daily Routines Manager!");

        while (true) {
            System.out.println("\n1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter time (Morning/Afternoon/Evening/Night): ");
                    String time = scanner.next();
                    System.out.print("Enter task name: ");
                    String taskName = scanner.next();
                    System.out.print("Enter priority (1-10): ");
                    int priority = scanner.nextInt();
                    dailyRoutine.addTask(time, taskName, priority);
                    System.out.println("Task added!");
                    break;
                case 2:
                    dailyRoutine.viewTasks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
