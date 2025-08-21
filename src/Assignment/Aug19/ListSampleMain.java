package Assignment.Aug19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSampleMain {
    public static void main(String[] args) {
        
        int sum = 0;
        List<Integer> list = new ArrayList<>();
       // list.add(10 15 25  30 35 45 50
        list.add(10);
        list.add(15);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(45);
        list.add(50);
        Iterator<Integer> iterator = list.iterator();
        
        while (iterator.hasNext()){
            Integer i = iterator.next();
            sum = sum + i;
        }
        System.out.println("Sum of List :"+ sum);

        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Integer i = iterator1.next();
            if (i % 2 == 0) {
                iterator1.remove();
            }
        }
        System.out.println("\nRemove even numbers from List :"+ list);



    }
}
