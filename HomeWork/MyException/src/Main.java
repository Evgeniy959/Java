import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();

        Triangle tr = new Triangle(a,b,c);
        double area = tr.getArea();
        System.out.println("area = " + area);

        in.close();

    }

}