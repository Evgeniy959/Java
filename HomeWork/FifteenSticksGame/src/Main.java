import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Выберите игру:");
        Game.menu();
        Scanner in = new Scanner(System.in);
        String select = in.nextLine();
        switch (select) {
            case "1":
                Game.twoUsers();
                break;
            case "2":
                Game.userPCRandom();
                break;
            case "3":
                Game.PCUser();
                break;
            case "4":
                Game.UserPC();
                break;
            default: // Неправильный ввод
                System.out.println("Повторите ввод");
                break;
        }
    }
}