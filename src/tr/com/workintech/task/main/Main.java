package tr.com.workintech.task.main;

import tr.com.workintech.task.model.Priority;
import tr.com.workintech.task.model.Status;
import tr.com.workintech.task.model.Task;
import tr.com.workintech.task.model.TaskData;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Task task1 = new Task("Sprint 15","Sprint 15 sunumunu hazırla!","Bob", Status.ASSIGNED, Priority.HIGH);
        System.out.println(task1);
        Task task2 = new Task("Sprint 16","Sprint 15 sunumunu hazırla!","Ann", Status.ASSIGNED, Priority.HIGH);

        Task task3 = new Task("Sprint 17","Sprint 15 sunumunu hazırla!","Carol", Status.ASSIGNED, Priority.HIGH);

        Task task4 = new Task("Sprint 18","Sprint 15 sunumunu hazırla!","Bob", Status.ASSIGNED, Priority.HIGH);

        Task task5 = new Task("Sprint 19","Sprint 15 sunumunu hazırla!","Bob", Status.ASSIGNED, Priority.HIGH);

        Task task6 = new Task("Sprint 20","Sprint 15 sunumunu hazırla!","Carol", Status.ASSIGNED, Priority.HIGH);

        Set<Task> annsTasks = new LinkedHashSet<>();
        Set<Task> bobTasks = new LinkedHashSet<>();
        Set<Task> carolTasks = new LinkedHashSet<>();
        Set<Task> unassignedTasks = new LinkedHashSet<>();
        annsTasks.add(task2);
        bobTasks.add(task4);
        bobTasks.add(task1);
        bobTasks.add(task5);
        bobTasks.add(task3);
        carolTasks.add(task3);
        carolTasks.add(task6);
        unassignedTasks.add(new Task("project 21","","",Status.IN_QUEUE, Priority.LOW));
        TaskData data = new TaskData(annsTasks,bobTasks,carolTasks,unassignedTasks);
        System.out.println("All tasks");
        System.out.println(data.getTasks("All"));
        System.out.println("Anns Tasks");
        System.out.println(data.getTasks("Ann"));
        System.out.println("Bob Tasks");
        System.out.println(data.getTasks("Bob"));
        System.out.println("Carol Tasks");
        System.out.println(data.getTasks("Carol"));
        System.out.println("unassigned Tasks");
        System.out.println(data.getDifference(data.getTasks("All"),data.getUnion(annsTasks,bobTasks)));
        System.out.println("Carol and Bob Tasks");
        System.out.println(data.getIntersect(carolTasks,bobTasks));

    }
}