package SetConcept;

import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetA {
    public static void main(String[] args) {

        Set<String> s1 = new HashSet<String>();
        s1.add("Ajay");
        s1.add("Barik");
        s1.add("Carry");
        s1.add("Dodo");
        s1.add("Eat");
        s1.add("Fish");
        s1.add("Null");
        s1.add("Ajay");
        System.out.println(s1);

        s1.stream().spliterator().forEachRemaining(System.out::println);

        Object m1[] = s1.toArray();
        System.out.println(Arrays.toString(m1));

        Set <Integer> s2 = new HashSet<Integer>();
        s2.add(220);
        s2.add(221);
        s2.add(232);
        s2.add(321);
        s2.add(352);
        s2.add(734);
        s2.add(542);
        System.out.println(s2);
        System.out.println((s1).equals(s2));

        Iterator<Integer> a1 = s2.iterator();

        while (a1.hasNext()) {

            System.out.println(a1.next());
        }
        Iterator<String> a2 = s1.iterator();
        while (a2.hasNext()) {

            System.out.println(a2.next());
        }
        Set<Integer> k1 = new HashSet<Integer>(s2);
        System.out.println(k1);

        // Unmodifiable Set:
        Set<Integer> z1 = Set.of(21, 123, 234, 435, 345, 124, 657);
//        System.out.println(z1);
        try {
            System.out.println(z1.remove(21));
        }
        catch (Exception e) {
            System.out.println("Cannot print: " + e.getMessage());
        }
    }
}
