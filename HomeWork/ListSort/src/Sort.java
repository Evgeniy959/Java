import java.util.*;
import java.util.stream.Stream;

public class Sort {
    public List<Integer> addSort(List<Integer> list1, List<Integer> list2){
        boolean flag = false;
        //List<Integer> list3 = list1;
        //List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).toList();
        List<Integer> list3 = new ArrayList<Integer>(list1);
        list3.addAll(list2);
        //list3.toArray();
        List<Integer> listRes = new ArrayList<>(){};
        //List<String> newList = ListUtils.union(list1, list2);
        int size3=list1.size()+list2.size();
        System.out.println(list3.size());
        System.out.println(list3);
        /*list3.remove(2);
        System.out.println(list3);*/
        /*for (Integer i:list1)
        {
            for (Integer j:list2)
            {
                if (i>j) list3.add(j);
                else list3.add(i);

            }
            //if (flag)list3.add(i);
        }*/
        //list3=list1;
        //if (flag=true) list3=list2;
        /*for (int i=0; i<list1.size(); i++){
            for (int j=0; j<list2.size(); j++){
                for (int k = 0; k < size3; k++)
                {
                    if (list1.get(i)<list2.get(j)){
                        //if (arrayC[k] == arrayN[j]) povtor++;
                        if (!listRes.contains(list1.get(i)))
                            listRes.add(list1.get(i));
                        //if (listRes.contains(list1.get(i))==listRes.contains(list2.get(j)))
                            //listRes.add(list2.get(j));
                        //listRes.set(k, list2.get(j));
                        //else listRes.add(k, list1.get(i));
                    }
                    else if (!listRes.contains(list2.get(j)))
                        listRes.add(list2.get(j));
                    else if (list1.get(i)==list2.get(j))
                        listRes.add(list2.get(j));
                }
            }


        }*/
        for (int i=0; i<size3; i++)
        {
            //Optional<Integer> min = list3.stream().min(Integer::compare);
            Integer min = Collections.min(list3);
            //Integer minim = min.get();
            //list3.remove(i);
            //listRes.add(min.get());
            listRes.add(min);
            //list3.set(i, min.get());
            //if (list3.contains(minim))
            list3.remove(min);
            System.out.println(list3);
            //size3--;

        }

        /*while (list1.size()!=0&&list2.size()!=0){
            Integer min1 = Collections.min(list1);
            Integer min2 = Collections.min(list2);
            if (min1<=min2){
                listRes.add(min1);
                list1.remove(min1);
            }
            else {
                listRes.add(min2);
                list2.remove(min2);
            }

        }*/
        /*while (list3.size()!=0){
            Integer min2 = Collections.min(list3);
            listRes.add(min2);
            list3.remove(min2);

        }*/
        /*do {
            Integer min = Collections.min(list1);
            listRes.add(min);
            list1.remove(min);
        }while (list1!=null);*/
        //listRes.set(0, 6);

        //System.out.println(minim);
        //System.out.println(size3);
        /*System.out.println(list1);
        System.out.println(list2);*/
        return listRes;
    }
}
