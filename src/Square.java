public class Square extends Figure implements Printable {

    double a;

    public Square(double a){
        this.a = a;
    }


    @Override
    double calculateAREA() {
        return a * a;
    }

    @Override
    double calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public void print() {
        System.out.println("a: " +a);
        System.out.println("Pole: " + calculateAREA());
        System.out.println("Obwód: " + calculatePerimeter());
    }
}
