package lab5_6.Task;

public class CounterOutTask implements Task {
    private static int counter = 0;

    @Override
    public void execute() {
        counter++;
        System.out.println("Counter: " + counter);
    }
}