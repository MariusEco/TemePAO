package lab5_6.Container;

import lab5_6.Task.Task;

public abstract class TaskContainer implements Container {
    protected Task[] tasks;
    protected int size;

    @Override
    public void push(Task task) {
        tasks[size++] = task;
    }
    
    public TaskContainer() {
        tasks = new Task[100];
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
