import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(list.stream().skip(6).findFirst().orElse("empty"));
        System.out.println(list1.stream().skip(6).findFirst().orElse("empty"));

        //4) Вернуть два элемента начиная со второго элемента коллекции;
        /*int[] res = (list.stream().mapToInt(s ->Integer.parseInt(s.substring(1))).toArray());
        System.out.println(Arrays.toString(res));*/
        System.out.println(list.stream().skip(1).limit(2).collect(Collectors.toList()));

        //5) Из коллекции имен убрать все повтарения и найти среднюю длину имен;
        List<String> average = new ArrayList<>(){};
        average.add("Tom");
        average.add("Nik");
        average.add("Jon");
        average.add("Alex");
        average.add("Evgeniy");
        average.add("Alex");
        average.add("Tom");
        //long resultAve = average.stream().distinct().reduce((s1,s2)->s1.length()+s2.length()).orElse("f");
        List<String> resultAve = average.stream().distinct().collect(Collectors.toList());
        System.out.println(resultAve);
        System.out.println(resultAve.size());
        List<String> resAve = average.stream().distinct().flatMap(s->Arrays.stream(s.split(""))).collect(Collectors.toList());
        System.out.println(resAve);
        System.out.println(resAve.size());
        System.out.println(resAve.size()/resultAve.size());

        //6) Отсортировать коллекцию строк по убыванию и убрать дубликаты;
        System.out.println(list.stream().sorted((s1,s2)->s2.compareTo(s1)).distinct().collect(Collectors.toList()));

        //7) Вернуть сумму нечетных чисел или 0;
        List<Integer> list2 = new ArrayList<>(){};
        list2.add(1);
        list2.add(5);
        list2.add(10);
        list2.add(12);
        list2.add(15);
        list2.add(20);
        list2.add(21);
        list2.add(22);

        int result2 = list2.stream().filter(n->n%2==0).reduce((x,y)->x+y).orElse(0);
        System.out.println(result2);
    }
}