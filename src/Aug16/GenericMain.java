package Aug16;


import java.util.*;

public class GenericMain {
    public static void main(String[] args) {
        Box<String, Character> box = new Box<>("90.4", 'a');
        box.s1 = "jj";
        box.s2 = 'k';
        Box<Integer, Integer> box1 = new Box<>(70, 9);

        System.out.println(box1.return1());
        System.out.println(box);
        List<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.reversed());


        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;
        System.out.println(wrapperInt);
    }
}

class Box <T,R>{
    T s1;
    R s2;

    public Box(T s1, R s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                '}';
    }
    public T return1(){
        return s1;
    }
}
