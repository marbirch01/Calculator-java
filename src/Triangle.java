import java.util.Scanner;

public class Triangle extends Figure implements Printable {

    double a, b, c;
    Scanner scanner = new Scanner(System.in);

    public Triangle(double a, double b, double c){
        while (c >= a + b || b >= a + c || a >= b + c){
            System.out.println("Nie można stworzyć trójkąta o podanych bokach\n");
            System.out.println("Podaj nowe boki trójkąta w postaci (bok;bok;bok): ");
            String command = scanner.nextLine();
            String[] split = command.split(";");
            a = Double.parseDouble(split[0]);
            b = Double.parseDouble(split[1]);
            c = Double.parseDouble(split[2]);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateAREA() {
        double p = calculatePerimeter() * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println("a: " + a + " b: " + b + " c: " + c);
        System.out.println("Pole: " + calculateAREA());
        System.out.println("Obwód: " + calculatePerimeter());
    }
}
