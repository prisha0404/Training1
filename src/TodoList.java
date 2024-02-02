import java.util.ArrayList;
import java.util.Scanner;


public class TodoList {

        private ArrayList<Task> theList;

        public void main(String[] args)
        {

            Scanner scanner=new Scanner(System.in);

            TodoList myList = new TodoList();


            myList.add("wake up time");
            myList.add("Excercise");
            myList.add("Travelling Time");
            myList.add("Affirmation");
            myList.add("Deep hours");
            myList.add("nap Time");
            myList.add("plan your day");

            myList.done("Start of the day");
            myList.done("Deep Hours");
            System.out.println();

            myList.todolistAusgeben();

        }

        public TodoList()
        {
            theList = new ArrayList<Task>();
        }

        public void add(String activity)
        {
            theList.add(new Task(activity));
        }

        public Task get(String activity)
        {
            for (Task task : theList)
                if (task.isCalled(activity))

                    return task;

            return null;
        }

        public void done(String activity)
        {
            Task task = get(activity);

            if (task != null)
                task.done();
        }

        public void todolistAusgeben()
        {
            int sizeOfList = theList.size();
            for (int i=0; i < sizeOfList; i++) {
                Task sTodo = theList.get(i);
                System.out.println(sTodo);
            }
        }

        private class Task {

            private String name;
            private boolean status;

            public Task(String name)
            {
                this.name = name;
                this.status = false;
            }

            public boolean isCalled(String name)
            {
                return this.name.equals(name);
            }

            public void done()
            {
                status = true;
            }

            public String toString()
            {
                return name + " : " + (status ? "DONE" : "Waiting...");
            }

        }

    }



