package lab7.ex1;

import java.io.*;
import java.util.*;

public class DoubleCalculator implements Calculator {

    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) throw new NullParameterException("Parametru null");
        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) throw new OverflowException("Overflow");
        if (result == Double.NEGATIVE_INFINITY) throw new UnderflowException("Underflow");
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, MyArithmeticException {
        if (a == null || b == null) throw new NullParameterException("Parametru null");
        if (b == 0) throw new MyArithmeticException("Impartire la 0");
        return a / b;
    }

    @Override
    public double average(Double[] values) throws NullParameterException, OverflowException, UnderflowException, MyArithmeticException {
        if (values == null || values.length == 0) throw new NullParameterException("Vector null sau gol");
        Double sum = 0.0;
        for (Double v : values) {
            sum = add(sum, v);
        }
        return divide(sum, (double) values.length);
    }

    public Double[] readValuesFromFile(String filename) throws FileProcessingException {
        List<Double> values = new ArrayList<>();
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                values.add(Double.parseDouble(scanner.nextLine()));
            }
            return values.toArray(new Double[0]);
        } catch (IOException | NumberFormatException e) {
            throw new FileProcessingException("Eroare la citirea fisierului: " + e.getMessage());
        }
    }

}

