import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String sticks = "";
    public static int sticksCount = 15;

    public static void Game(int stick){
        for (int i = 0; i < stick; i++)
        {
            sticks = "|";
            System.out.print(sticks);
        }
        System.out.println();
    }

    public static int random(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*System.out.println("Start");
        Game(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Gamer1 Вы проиграли!"); break;}
            else System.out.println("Gamer1");
            int a = in.nextInt();;
            sticksCount -=a;
            Game(sticksCount);
            if(sticksCount==1){
                System.out.println("Gamer2 Вы проиграли!"); break;}
            else System.out.println("Gamer2");
            int b = in.nextInt();;
            sticksCount -=b;
            Game(sticksCount);
        }*/

// artificial intelligence

        System.out.println("Start");
        Game(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Вы проиграли!"); break;}
            else System.out.println("Gamer1");
            int a = in.nextInt();;
            sticksCount -=a;
            Game(sticksCount);
            if(sticksCount==1){
                System.out.println("Вы выйграли!"); break;}
            else System.out.println("PC");
            int b = random(1, 3);
            sticksCount -=b;
            Game(sticksCount);
        }

    }
}