import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Дана коллекция строк {"a1", "a2", "a3", "a1", "a4", "a5", "a1"}
        List<String> list = new ArrayList<>(){};
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");
        list.add("a4");
        list.add("a5");
        list.add("a1");
        System.out.println(list);
        List<String> list1 = new ArrayList<>(){};
        //1) Вернуть количество вхождений объекта «a1» с помощью streamAPI;
        long result = list.stream().filter("a1"::equals).count();
        System.out.println(result);
        System.out.println(list.stream().filter("a1"::equals).count());

        //2) Найти элемент в коллекции равный «a3» или вывести ошибку;
        System.out.println(list.stream().filter("a3"::equals).findFirst().orElseThrow());
        System.out.println(Stream.of("a1", "a2", "a3", "a1", "a4", "a5", "a1").filter(n->n.contains("a3")).findFirst().orElseThrow());

        //3) Вернуть последний элемент коллекции или «empty», если коллекция пуста;
        System.out.println(list1.stream().skip(6).findFirst().orElse("empty"));

        //4) Вернуть два элемента начиная со второго элемента коллекции;
        //System.out.println(list.stream().filter(s->s.substring(1, 3)));

        //5) Из коллекции имен убрать все повтарения и найти среднюю длину имен;
        List<String> result1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result1);
    }
}