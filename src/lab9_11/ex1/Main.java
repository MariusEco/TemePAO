package lab9_11.ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Comparator.reverseOrder();
        Catalog catalog = new Catalog(comparator);
        catalog.add(new Student("Ionescu", 8.3f));
        catalog.add(new Student("Raducioiu", 7.6f));
        catalog.add(new Student("Ganea", 9.1f));
        catalog.add(new Student("Lupei", 8.9f));
        catalog.add(new Student("Milcu", 7.5f));
        catalog.add(new Student("Stan", 6.8f));
        catalog.add(new Student("Cristescu", 8.0f));
        catalog.add(new Student("Manole", 5.4f));
        catalog.add(new Student("Albescu", 7.49f));
        catalog.add(new Student("Neagu", 7.50f));
        for (Map.Entry<Integer, List<Student>> entry : catalog.getCatalog().entrySet()) {
            List<Student> studenti = entry.getValue();
            studenti.sort(Comparator.comparing(Student::getNume));
            System.out.println("Medie rotunjita: " + entry.getKey());
            for (Student student : studenti) {
                System.out.println("  " + student.getNume() + " (media: " + student.getMedie() + ")");
            }
        }
    }
}