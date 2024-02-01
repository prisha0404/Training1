import java.util.*;

public class Task {
    public static void main(String[] args) {
        new DailyRoutinesProject();
    }

        private String name;
        private int priority;

    public Task() {
            this.name = name;
            this.priority = priority;
        }

        public String getName () {
            return name;
        }

        public int getPriority () {
            return priority;
        }
    }

    class DailyRoutine {
        private Map<String, List<Task>> routine;

        public DailyRoutine() {
            routine = new HashMap<>();
            routine.put("Morning", new ArrayList<>());
            routine.put("Afternoon", new ArrayList<>());
            routine.put("Evening", new ArrayList<>());
            routine.put("Night", new ArrayList<>());
        }

        public void addTask(String time, String taskName, int priority) {
            Task task = new Task();
            routine.get(time).add(task);
        }

        public void viewTasks() {
            for (Map.Entry<String, List<Task>> entry : routine.entrySet()) {
                System.out.println(entry.getKey() + " tasks:");
                List<Task> tasks = entry.getValue();
                if (tasks.isEmpty()) {
                    System.out.println("No tasks scheduled.");
                } else {
                    Collections.sort(tasks, Comparator.comparingInt(Task::getPriority).reversed());
                    for (Task task : tasks) {
                        System.out.println("- " + task.getName() + " (Priority: " + task.getPriority() + ")");
                    }
                }
                System.out.println();
            }
        }
    }



