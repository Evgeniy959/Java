import com.example.oop.Book;
import com.example.oop.Fraction;
import com.example.oop.Human;

public class Main {
    public static void main(String[] args) {

        Human.movement();
        Human.movement(" бежит");

        System.out.println("Математические операции с дробями с переводом в правильную и в неправильную дробь и с сокращением:");

        Fraction A = new Fraction(3, 2);
        Fraction B = new Fraction(2, 5);

        Fraction A1 = new Fraction(4,1, 4);
        Fraction B1 = new Fraction(3,2, 5);

        System.out.println("Сложение:");
        Fraction addition = Fraction.addition(A, B);
        Fraction addition1 = Fraction.addition(A1, B1);

        System.out.println("Вычитание:");
        Fraction subtraction = Fraction.subtraction(A, B);
        Fraction subtraction1 = Fraction.subtraction(A1, B1);

        System.out.println("Умножение с перегрузкой метода:");
        Fraction multiply = Fraction.multiply(A, B);
        Fraction multiply1 = Fraction.multiply(A1, B1);
        Fraction multiply2 = Fraction.multiply(A, B, A1);

        System.out.println("Деление:");
        Fraction division = Fraction.division(A, B);
        Fraction division1 = Fraction.division(A1, B1);

        Book book1 = new Book("Гадюка в сиропе", "Дарья Донцова", "2016");
        Book book = new Book();
    }
}