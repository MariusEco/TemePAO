package lab9_11.ex1;

class Student {
    private String nume;
    private float medie;

    public Student(String nume, float medie) {
        this.nume = nume;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public float getMedie() {
        return medie;
    }

    @Override
    public String toString() {
        return "Student{" + "nume='" + nume + '\'' + ", medie=" + medie + '}';
    }
}
