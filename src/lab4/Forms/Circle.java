package lab4.Forms;

public class Circle extends Form {
    private float radius;

    public Circle() {}

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " " + getArea();
    }

    public void printCircleDimensions() {
        System.out.println("Raza: " + radius);
    }

    @Override
    public void printDimensions() {
        System.out.println("Raza: " + radius);
    }
}
