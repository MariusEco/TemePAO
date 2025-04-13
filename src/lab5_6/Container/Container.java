package lab5_6.Container;

import lab5_6.Task.Task;

public interface Container {
    void push(Task task);
    Task pop();
    boolean isEmpty();
}