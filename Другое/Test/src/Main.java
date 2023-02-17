import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    static char Min(char[] array)
    {
        char min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i]) min = array[i];
        }
        return min;
    }
    static char Max(char[] array)
    {
        char max = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*int count=0;
        for (int i=2; i<20; i++){
            if(i%2!=0||i==2){
                count++;
                System.out.print(i+", ");
            }
        }
        System.out.println();
        System.out.println(count);*/
        /*List<Character> str = new ArrayList<>(){};
        List<Character> listRes = new ArrayList<>(){};

        str.add('f');
        str.add('r');
        str.add('s');
        str.add('g');
        str.add('m');
        str.add('x');
        str.add('a');
        str.add('b');
        str.add('c');
        str.add('d');
        str.add('.');
        str.add('-');
        str.add('5');
        int size = str.size();*/



        //char[] str = {'f','i','u','e','w', 'w', '/', 'a','m','a'};
        //char[] str1 = new char[str.length];
        /*for (int i=0; i<size; i++){
            Character min = Collections.min(str);
            listRes.add(min);
            str.remove(min);

        }*/

        // Второй способ:
        /*while (str.size()!=0){
            Character min = Collections.min(str);
            listRes.add(min);
            str.remove(min);
        }*/
        Character[] str = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        //List<Character> list = Arrays.asList(str);
        List<Character> list = new ArrayList<>(){};
        Collections.addAll(list, str);
        List<Character> listRes = new ArrayList<>(){};
        //char[] str1 = new char[str.length];
        Collections.sort(list);
        System.out.println(list);

        // Второй способ:
        while (list.size()!=0){
            Character min = Collections.min(list);
            listRes.add(min);
            list.remove(min);
        }
        System.out.println(listRes);

//        char[] str = {'f','i','u','e','w', 'w', 'a','m','a'};
//        char[] str1 = new char[str.length];
        /*for (int i=0; i<str1.length; i++){
            char min = Min(str);
            str1[i]=min;
            str.
        }
//        for (int i=0; i<str1.length; i++){
//            while (str1.length<=str.length){
//                if (str[i]<str[i+1])
//                    str1[i]=str[i];
//                else str1[i]=str[i+1];
//            }
//        }
        System.out.println(str1);*/

        /*char[] str = {'f','i','u','e','w', 'w', 'a','m','a'};
        for (int j=str.length-1; j>0; j--){
            {
                for (int i=0; i<j; i++){

                    if (str[i]>str[i+1]){
                        char temp = str[i];
                        str[i]=str[i+1];
                        str[i+1]=temp;
                    }

                }

            }
        }
        System.out.println(str);*/
        int arr[] ={3,5,5,6,7,2,3,7};
        int max = 0;
        for (int x: arr) {
            if (x>max) max=x;
        }
        System.out.println(max);

        System.out.println(Pattern.matches("^[а-яёa-z]*[А-ЯЁA-Z]{1}[а-яёa-z]*$","яблоКо"));
        //Pattern pattern = Pattern.compile("abc");
        System.out.println(Pattern.compile("Три богатыря"));

        //Сортировка подсчётом

        char[] chars = {'f','i','u','e','w', 'w', '.', 'a','m','a'};
        //char[] chars1 = new char[256];
        char minC = Min(chars);
        char maxC = Max(chars);
        char[] chars1 = new char[maxC+1];
        //System.out.println(maxC);
        int j = 0;
        /*for (int i=minC; i<=maxC; i++){
            chars1[i]=0;
        }*/
        for (int i=0; i<chars.length; i++){
            chars1[chars[i]]+=1;
        }
        for (int i=minC; i<=maxC; i++){
            while (chars1[i] > 0) {
                // добавляем номер ячейки в исходный массив
                chars[j] = (char) i;
                // переходим к следующему элементу в исходном массиве
                j++;
                // уменьшаем на единицу содержимое ячейки в массиве с подсчётом
                chars1[i]--;
            }
        }
        System.out.println(chars);


    }
}