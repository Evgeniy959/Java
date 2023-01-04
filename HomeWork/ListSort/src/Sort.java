import java.util.*;

public class Sort {
    public List<Integer> addSort(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<Integer>(list1);
        list3.addAll(list2);
        List<Integer> listRes = new ArrayList<>(){};
        int size3=list1.size()+list2.size();
        System.out.println(size3);
        System.out.println(list3);

        // Первый способ:
        /*for (int i=0; i<size3; i++)
        {
            Integer min = Collections.min(list3);
            listRes.add(min);
            list3.remove(min);
            //System.out.println(list3);
        }*/

        // Второй способ:
        while (list3.size()!=0){
            Integer min = Collections.min(list3);
            listRes.add(min);
            list3.remove(min);
        }

        return listRes;
    }
}
