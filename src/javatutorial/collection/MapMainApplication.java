package javatutorial.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMainApplication {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Aakash");
        hm.put(101, "Prarup");
        hm.put(102, "Sujan");

        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(100, "Amit");
        linkedHashMap.put(101, "Vijay");
        linkedHashMap.put(102, "Rahul");

        for (Map.Entry m : linkedHashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }


        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
