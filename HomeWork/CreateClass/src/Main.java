import com.example.oop.Book;
import com.example.oop.Car;
import com.example.oop.Fraction;
import com.example.oop.Human;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Класс Человек:
        Human.movement();
        Human.movement(" бежит");

        // Класс Дробь:
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

        // Класс Книга:
        Book book = new Book("За всеми зайцами", "Дарья Донцова", "2007");
        Book book1 = new Book();
        book.show();
        Book show = book1.show("Роковой подарок", "Татьяна Устинова", "2022");
        System.out.println(show.nameBook+", " + show.author+", " + show.yearRelease+" год");
        Book show1 = book1.show("Роковой подарок", "Татьяна Устинова", 320);
        System.out.println(show1.nameBook+", " + show1.author+", " + show1.pageCount+" стр");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название издательства: ");
        String namePublishingHouse =in.nextLine();
        System.out.print("Введите жанр книги: ");
        String genre = in.nextLine();
        Book book2 = new Book(namePublishingHouse, genre);

        // Класс Автомобиль:
        Car car = new Car("Toyota RAV4", "Япония", "2008");
        Car car1 = new Car();
        car.show();
        Car info = car.show("Honda Fit", "Япония", "2017");
        System.out.println("Название автомобиля: "+ info.getNameCar()+","+" производитель: "+info.maker+","+" год выпуска: "+info.yearRelease);
        car.show("Toyota Camry", "Япония");
        car.show1("Toyota Camry", "Япония", 2.5);
    }
}