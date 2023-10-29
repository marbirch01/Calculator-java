public class Prism extends Figure implements Printable{

    double h;
    Figure base;

    public Prism(Figure base, double h){
        this.h = h;
        this.base = base;
    }


    @Override
    double calculateAREA() {
        return this.base.calculateAREA() * h;
    }

    @Override
    double calculatePerimeter() {
        return 2 * this.base.calculateAREA() + this.base.calculatePerimeter() * h;
    }

    @Override
    public void print() {
        System.out.println("Pole: " + this.calculateAREA());
        System.out.println("Obwód: " + this.calculatePerimeter());
    }
}
