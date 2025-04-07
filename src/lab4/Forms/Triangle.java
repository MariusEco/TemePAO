package lab4.Forms;

public class Triangle extends Form {
    private float base;
    private float height;

    public Triangle() {}

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " + getArea();
    }

    public void printTriangleDimensions() {
        System.out.println("Baza: " + base + ", Inaltime: " + height);
    }

    @Override
    public void printDimensions() {
        System.out.println("Baza: " + base + ", Inaltime: " + height);
    }

    // Am ales sa compar doar base si height deoarece acestea determina dimensiunea si forma geometrica a triunghiului.
    // Culoarea este o proprietate vizuala, nu afecteaza forma propriu-zisa
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle other) {
            return this.base == other.base && this.height == other.height;
        }
        return false;
    }
}
