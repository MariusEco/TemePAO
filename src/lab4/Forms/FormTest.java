package lab4.Forms;

public class FormTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("rosu", 4, 5);
        Circle c1 = new Circle("verde", 2);
        System.out.println(t1);
        System.out.println(c1);

        Triangle t2 = new Triangle("magenta", 4, 5);
        System.out.println("t1 == t2? " + t1.equals(t2));

        Form[] forms = new Form[4];
        forms[0] = new Triangle("albastru", 3, 6);
        forms[1] = new Circle("galben", 4);
        forms[2] = new Triangle("rosu", 2, 8);
        forms[3] = new Circle("verde", 3);
        // Chiar daca vectorul este de tip Form, metoda toString() apelata este cea suprascrisa din clasele Triangle si Circle
        for (Form f : forms) {
            System.out.println(f);
        }

        for (Form f : forms) {
            if (f instanceof Triangle t) {
                t.printTriangleDimensions();
            } else if (f instanceof Circle c) {
                c.printCircleDimensions();
            }
        }

        for (Form f : forms) {
            f.printDimensions();
        }
    }
}
