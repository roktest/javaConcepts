package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetAndHashSet {

    public static void main(String[] args) {

        //cant create instances of interfaces only of classes which implements those interfaces that's why we need to use hashset
        // Set<String> names = new Set(); // UNCOMMENT TO TEST
        Set<String> names = new HashSet<>();

        names.add("Rodrigo");
        names.add("Maria");
        names.add("Arnold");
        names.add("Juana");
        names.add("Pedro");
        names.add("Rodrigo");
        names.add("toRemove");

        /**
         * used when a collection of items is needed with
         * no order when printing,
         * and no duplicated records allowed by design
         *
         */
        names.remove("toRemove");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Raul"));
        System.out.println("-------------");
        // enhanced for loop
        for (String name: names) {
            System.out.println(name);
        }
        System.out.println("-------------");
        // lambda
        names.forEach(System.out::println);
        System.out.println("-------------");
        // iterator loop
        Iterator namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        System.out.println("-------------");
        names.clear();
        System.out.println(names);

        for (String name: names) {
            System.out.println(name);
        }
    }

}
