package javatutorial.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMainApplication {
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        HashSet<String> set = new HashSet<String>();
        set.add("Ajay");
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        //Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Vijay");
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Ajay");
        Iterator<String> linkedHashItr = linkedHashSet.iterator();
        while (linkedHashItr.hasNext()) {
            System.out.println(linkedHashItr.next());
        }


        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ravi");
        treeSet.add("Ajay");
        //traversing elements
        Iterator<String> treeItr = treeSet.iterator();
        while (treeItr.hasNext()) {
            System.out.println(treeItr.next());
        }
    }
}
