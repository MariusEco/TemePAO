package lab5_6.Container;

import lab5_6.Task.Task;

public class StackContainer extends TaskContainer {

    @Override
    public Task pop() {
        return isEmpty() ? null : tasks[--size];
    }
}