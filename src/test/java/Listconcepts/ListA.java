package Listconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListA {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();
        l1.add("Arun");
        l1.add("Bob");
        l1.add("David");
        l1.add("null");
        l1.add("Bob");
        l1.add("rahul");
        System.out.println(l1);

        List<String> l2 = new ArrayList<String>();
        l2.add("Arun G");
        l2.add("Bob B");
        l2.add("David C");
        l2.add("null D");
        l2.add("Bob E");
        l2.add("rahul F");
        System.out.println(l2);

        System.out.println(l1.isEmpty());
        System.out.println(l1.reversed());

        System.out.println(l1.contains("sahil"));

        try {
            System.out.println(l2.stream().max(String::compareTo).get());
        }
        catch (Exception e) {
            System.out.println("Error in code");
        }

        List<String> m1 = l1.subList(2, 4);
        System.out.println(m1);

        l1.addAll(l2);
        System.out.println(l1);

        l2.replaceAll(s1 -> s1.toUpperCase());
        System.out.println(l2);

        Collections.sort(l2, Collections.reverseOrder());
        System.out.println(l2);


    }
}
