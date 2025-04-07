package lab4.Forms;

public class Form {
    protected String color;

    public Form() {}

    public Form(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public void printDimensions() {}

    @Override
    public String toString() {
        return color;
    }
}
