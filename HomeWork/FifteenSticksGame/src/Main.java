public class Main {
    public static String sticks = "";
    public static int stick = 15;

    public static void startGame(){
        for (int i = 0; i < stick; i++)
        {
            sticks = "|";
            System.out.print(sticks);
            /*label1.Text = (sticks);
            label2.Text = (stick.ToString());*/
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        startGame();

    }
}