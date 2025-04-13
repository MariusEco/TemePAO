package lab5_6;

import lab5_6.Container.Container;
import lab5_6.Container.QueueContainer;
import lab5_6.Container.StackContainer;
import lab5_6.Task.CounterOutTask;
import lab5_6.Task.OutTask;
import lab5_6.Task.RandomOutTask;
import lab5_6.Task.Task;

public class Main {
    public static void main(String[] args) {
        Task t1 = new OutTask("Hello");
        Task t2 = new RandomOutTask();
        Task t3 = new CounterOutTask();
        Task t4 = new CounterOutTask();

        Container stack = new StackContainer();
        Container queue = new QueueContainer();

        stack.push(t1);
        stack.push(t2);
        stack.push(t3);
        stack.push(t4);

        while (!stack.isEmpty()) {
            stack.pop().execute();
        }
        
        System.out.println();

        queue.push(t1);
        queue.push(t2);
        queue.push(t3);
        queue.push(t4);

        while (!queue.isEmpty()) {
            queue.pop().execute();
        }
    }
}