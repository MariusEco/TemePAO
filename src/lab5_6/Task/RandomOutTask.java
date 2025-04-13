package lab5_6.Task;

import java.util.Random;

public class RandomOutTask implements Task {
    private int number;

    public RandomOutTask() {
        number = new Random().nextInt();
    }

    @Override
    public void execute() {
        System.out.println("Number: " + number);
    }
}
