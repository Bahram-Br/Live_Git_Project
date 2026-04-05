package LiveClasses;

import java.util.ArrayList;

public class ArraysListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(38);
        list.add(4);
        list.add(5);
        list.add(693);
        list.add(0,100);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.size());
        System.out.println(list.get(list.size()-1));
        System.out.println(list.contains(100));
    }
}
