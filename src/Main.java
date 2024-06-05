//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape s = new Shape(10,20);
        s.display();

        s = new Circle(7,12,25);
        ((Circle)s).setR(89);
        s.display();

        s = new Rectangle(34,23,56,89);
        ((Rectangle)s).setH(67);
        ((Rectangle)s).setW(90);
        s.display();

    }
}