package Aug19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lIstMain {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(900);
        list1.add(2,100);
        System.out.println(list1);

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(900);
        list.add(2,100);
//        System.out.println(list.subList(1, 3));
//
//        System.out.println(list.containsAll(List.of(10,200)));
//        System.out.println("Is empty :"+ list.isEmpty());
//        System.out.println(list);


    }
}
