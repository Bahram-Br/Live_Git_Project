package day01;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayInToGit {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);

        for(int i = 0; i < list.size(); i++){
            if (list.get(i) % 2 == 0){
                list.set(i, list.get(i) + 10);
                System.out.println("Hello Bahram you did a great job");
            }
        }
        System.out.println(list);
    }
}
