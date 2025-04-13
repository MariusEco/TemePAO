package lab5_6.Container;

import lab5_6.Task.Task;

public class QueueContainer extends TaskContainer {
    private int start = 0;

    @Override
    public Task pop() {
        return isEmpty() ? null : tasks[start++];
    }

    @Override
    public boolean isEmpty() {
        return start == size;
    }
}