package Assignment.Aug19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSampleMain {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(75);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(45);
        list.add(50);

        // Sum Of List
        int sum = 0;
        Iterator<Integer> iteratorSum = list.iterator();
        while (iteratorSum.hasNext()){
            Integer listElement = iteratorSum.next();
            sum = sum + listElement;
        }
        System.out.println("Sum of List :"+ sum);

        //Remove even numbers from List
        Iterator<Integer> iteratorRemove = list.iterator();
        while (iteratorRemove.hasNext()) {
            Integer listElement = iteratorRemove.next();
            if (listElement % 2 == 0) {
                iteratorRemove.remove();
            }
        }
        System.out.println("\nRemove even numbers from List :"+ list);

        //Maximum in List
        Iterator<Integer> iteratorMax = list.iterator();
        Integer max = iteratorMax.next();
        while (iteratorMax.hasNext()) {
            Integer iteratorValue = iteratorMax.next();
            if (max < iteratorValue) {
                max = iteratorValue;
            }
        }
        System.out.println("\nMaximum Number in List : "+ max);

        //Minimum In List
        Iterator<Integer> iteratorMin = list.iterator();
        Integer min = iteratorMin.next();

        while (iteratorMin.hasNext()){
            Integer iteratorValue = iteratorMin.next();
            if (min>iteratorValue){
                min = iteratorValue;
            }
        }
        System.out.println("Minimum Number in List : "+min);


    }
}
