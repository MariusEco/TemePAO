package lab7.ex1;

public class Main {
    public static void main(String[] args) {
        DoubleCalculator calc = new DoubleCalculator();

        try {
            calc.add(null, 5.0);
        } catch (Exception e) {
            System.out.println("Test NullParameterException (add): " + e.getMessage());
        }

        try {
            calc.divide(5.0, null);
        } catch (Exception e) {
            System.out.println("Test NullParameterException (divide): " + e.getMessage());
        }

        try {
            calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Test OverflowException: " + e.getMessage());
        }

        try {
            calc.add(-Double.MAX_VALUE, -Double.MAX_VALUE);
        } catch (Exception e) {
            System.out.println("Test UnderflowException: " + e.getMessage());
        }

        try {
            calc.divide(10.0, 0.0);
        } catch (Exception e) {
            System.out.println("Test MyArithmeticException: " + e.getMessage());
        }

        try {
            calc.average(null);
        } catch (Exception e) {
            System.out.println("Test NullParameterException (average): " + e.getMessage());
        }

        try {
            calc.readValuesFromFile("nu_exista.txt");
        } catch (Exception e) {
            System.out.println("Test FileProcessingException: " + e.getMessage());
        }

        // Trebuie creat fisierul input.txt pentru acest cod
        try {
            Double[] values = calc.readValuesFromFile("input.txt");
            System.out.println("Add: " + calc.add(values[0], values[1]));
            System.out.println("Divide: " + calc.divide(values[0], values[1]));
            System.out.println("Average: " + calc.average(values));
        } catch (Exception e) {
            System.out.println("Eroare la testele pe fisier valid: " + e.getMessage());
        }
    }
}

