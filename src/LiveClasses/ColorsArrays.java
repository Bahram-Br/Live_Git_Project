package LiveClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColorsArrays {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Green","Blue"));

        colors.add("Yellow");
        colors.add("Purple");
        colors.add(0, "Black");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        colors.removeIf(co -> co.length() <= 4);
        System.out.println(colors);
    }
}
