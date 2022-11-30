import com.example.oop.modelAnimal.Animal;
import com.example.oop.modelAnimal.Crocodile;
import com.example.oop.modelAnimal.Kangaroo;
import com.example.oop.modelAnimal.Tiger;
import com.example.oop.modelHuman.Builder;
import com.example.oop.modelHuman.Human;
import com.example.oop.modelHuman.Pilot;
import com.example.oop.modelHuman.Sailor;

public class Main {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Animal crocodile = new Crocodile();
        Animal kangaroo = new Kangaroo();

        Human builder = new Builder();
        Human sailor = new Sailor();
        Human pilot = new Pilot();
    }
}