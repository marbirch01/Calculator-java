import java.sql.SQLOutput;

public class Circle extends Figure implements Printable {

    double r;

    public Circle (double r){
        this.r = r;
    }

    @Override
    double calculateAREA() {
        return r * r * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * r * Math.PI;
    }

    @Override
    public void print() {
        System.out.println("r: " + r);
        System.out.println("Pole: " + calculateAREA());
        System.out.println("Obwód: " + calculatePerimeter());
    }
}
