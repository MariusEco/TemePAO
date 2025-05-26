package lab9_11.ex1;

import java.util.*;

class Catalog {
    private Map<Integer, List<Student>> catalog;

    public Catalog(Comparator<Integer> comparator) {
        this.catalog = new TreeMap<>(comparator);
    }

    public void add(Student student) {
        if (student.getMedie() < 0 || student.getMedie() > 10) {
            throw new IllegalArgumentException("Media trebuie sa fie intre 0 si 10");
        }
        int medieRotunjita = (int) Math.round(student.getMedie());
        catalog.computeIfAbsent(medieRotunjita, k -> new ArrayList<>()).add(student);
    }

    public Map<Integer, List<Student>> getCatalog() {
        return catalog;
    }
}
