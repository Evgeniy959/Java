import java.util.Random;
import java.util.Scanner;

public class Game {
    public static String sticks = "";
    public static int sticksCount = 15;

    public static void menu()
    {
        System.out.println("1. Два игрока");
        System.out.println("2. ПК и игрок");
        System.out.println("3. ПК и игрок у ПК первый ход");
        System.out.println("4. ПК и игрок у игрока первый ход");
    }
    public static void showSticks(int stick){
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

    public static void twoUsers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Start");
        showSticks(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Gamer1 Вы проиграли!"); break;}
            else System.out.println("Gamer1 введите число от 1 до 3");
            int a = in.nextInt();
            sticksCount -=a;
            showSticks(sticksCount);
            if(sticksCount==1){
                System.out.println("Gamer2 Вы проиграли!"); break;}
            else System.out.println("Gamer2 введите число от 1 до 3");
            int b = in.nextInt();
            sticksCount -=b;
            showSticks(sticksCount);
        }
    }

    // Режим с искусственным интеллектом
    public static void userPCRandom() {
        Scanner in = new Scanner(System.in);
        System.out.println("Start");
        showSticks(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Вы проиграли!"); break;}
            else System.out.println("Gamer введите число от 1 до 3");
            int a = in.nextInt();
            sticksCount -=a;
            showSticks(sticksCount);
            if(sticksCount==1){
                System.out.println("Вы выйграли!"); break;}
            else System.out.println("PC");
            if(sticksCount==2) {
                int b = random(1, 1);
                sticksCount -=b;
                showSticks(sticksCount);
            }
            else if(sticksCount==3) {
                int b = random(1, 2);
                sticksCount -=b;
                showSticks(sticksCount);
            }
            else if (sticksCount>3){
                int b = random(1, 3);
                sticksCount -=b;
                showSticks(sticksCount);
            }
        }
    }

    // Режим с искусственным интеллектом всегда выигрывает ПК
    //Первый ход у ПК
    public static void PCUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Start");
        int b=0;
        showSticks(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Вы выйграли!"); break;}
            else System.out.println("PC");
            if(sticksCount==15) {
                int a = 2;
                sticksCount -=a;
                showSticks(sticksCount);
            }
            else {
                int a = 4-b;
                sticksCount -=a;
                showSticks(sticksCount);}
            if(sticksCount==1){
                System.out.println("Вы проиграли!"); break;}
            else System.out.println("Введите число от 1 до 3");
            b = in.nextInt();
            sticksCount -=b;
            showSticks(sticksCount);
        }
    }
    //Первый ход у человека
    public static void UserPC() {
        System.out.println("Start");
        int b=0;
        int a=0;
        showSticks(sticksCount);
        while (sticksCount>0){
            if(sticksCount==1){
                System.out.println("Вы проиграли!"); break;}
            else System.out.println("Введите число от 1 до 3");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            sticksCount-=a;
            showSticks(sticksCount);
            if(sticksCount==1){
                System.out.println("Вы выйграли!"); break;}
            else System.out.println("PC");
            if(sticksCount==14 && a == 1) {
                b = 1;
                sticksCount-=b;
                showSticks(sticksCount);
            }
            else if(sticksCount==12 && a == 3) {
                b = 3;
                sticksCount-=b;
                showSticks(sticksCount);
            }
            else if(sticksCount==13 && a == 2) {
                b = 3;
                sticksCount -=b;
                showSticks(sticksCount);

            }
            else if (sticksCount==8 && a==2){
                b = 3;
                sticksCount -=b;
                showSticks(sticksCount);
            }
            else if (sticksCount==7 && a==3){
                b = 2;
                sticksCount -=b;
                showSticks(sticksCount);
            }
            else {
                b = 4-a;
                sticksCount -=b;
                showSticks(sticksCount);
            }
        }
    }
}
