import java.util.Random;
import java.util.Scanner;

public class UserInterface {

    public void menu() {
        System.out.println("Napisz nazwę figury której pole i obwód chciałbyś policzyć: ");
        System.out.println("1. Kwadrat");
        System.out.println("2. Trójkąt");
        System.out.println("3. Okrąg");
        System.out.println("4. Graniastosłup prawidłowy");
        System.out.println("Jeśli chcesz zakończyć program napisz 'koniec'");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("koniec")) {
                break;
            }

        switch (command) {
            case "kwadrat" -> Square();
            case "trójkąt" -> Triangle();
            case "okrąg" -> Circle();
            case "graniastosłup" -> Prism();
            }
        }
    }


    public void Square() {
        System.out.printf("Wybrałeś kwadrat, podaj bok:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            double a = Double.parseDouble(command);
            Square square = new Square(a);
            square.print();
            break;
        }
        menu();
    }
    public void Triangle() {
        System.out.printf("Wybrałeś trójkąt, podaj boki w formacie (bok;bok;bok):");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            String[] split = command.split(";");
            double a = Double.parseDouble(split[0]);
            double b = Double.parseDouble(split[1]);
            double c = Double.parseDouble(split[2]);
            Triangle trangle = new Triangle(a, b, c);
            trangle.print();
            break;
        }
        menu();
    }
    public void Circle() {
        System.out.printf("Wybrałeś okrąg, podaj promień:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            double a = Double.parseDouble(command);
            Circle circle = new Circle(a);
            circle.print();
            break;
        }
        menu();
    }

    public void Prism(){
        System.out.printf("Wybrałeś Graniastosłup prawidłowy, wybierz podstawę: \n");
        System.out.printf("1 - Kwadrat \n");
        System.out.printf("2 - Trójąt \n");
        System.out.printf("3 - Okrąg \n");
        Scanner scanner = new Scanner(System.in);
        Figure base = prismBase();
        System.out.println("Podaj wysokość graniastosłupa: ");
        Prism prism = new Prism(base, scanner.nextInt());
        prism.print();
        menu();
    }

    public Figure prismBase(){
        Figure base = null;
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Wybrałeś kwadrat, podaj bok:");
                base = new Square(scanner.nextInt());
                break;
            case 2:
                System.out.println("Wybrałeś trójkąt, podaj boki:");
                base = new Triangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                if ((((Triangle) base).a == ((Triangle) base).b) && (((Triangle) base).a == ((Triangle) base).c)){
                    System.out.println("Utworzony graniastosłup będzie prawidłowy poniewać w jego podstawie znajduję się trójkąt równoboczny");
                }else{
                    System.out.println("Utworzony graniastosłup nie będzie prawidłowy ponieważ w jego podstawie nie występuję trójkąt równoboczny");
                }
                break;
            case 3:
                System.out.println("Wybrałeś okrąg, w tym przypadku obliczenia będą dotyczyły walca, podaj promień okręgu:");
                base = new Circle(scanner.nextInt());
                break;
            default:
                System.out.printf("Wybierz figurę od 1 do 3");
                break;
        }
        return base;
    }

}
