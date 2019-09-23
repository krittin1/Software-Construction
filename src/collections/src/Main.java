// Collections

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Collection<String>  collection = new ArrayList<>();
        Collection<String>  collection = new HashSet<>();
        System.out.println("Size: " + collection.size());
        collection.add("Nook");
        collection.add("Bob");
        collection.add("Atom");
        collection.add("");
        collection.add(null);
        System.out.println("Size: " + collection.size());

        System.out.println(collection.toString());

        System.out.println(collection.remove("Atom"));
        System.out.println("Size: " + collection.size());
        System.out.println(collection.toString());

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        System.out.println("-------------------------------------------------------------");
        for (String name : collection){
            System.out.println(name);
        }


        LinkedList<String> names = new LinkedList<>();
        names.add("Bob");
        names.addLast("Atom");
        names.addFirst("Nook");
        System.out.println(names);
        System.out.println("Remove: " + names.removeLast());
        System.out.println(names);


        Map<String, Double> studentScores = new TreeMap<>();
        studentScores.put("Java", 88.88);
        studentScores.put("Bob", 1.90);
        studentScores.put("C++", 34.7);
        studentScores.put("Alice", 90.0);

        System.out.println(studentScores);
        String mark = null;
        for (String key : studentScores.keySet()) {
            Double value = studentScores.get(key);
            if (value.equals(1.9)){
                mark = key;
            }

            System.out.println("Key: "+ key + ", Value: " + value);
        }
        if (mark != null){
            studentScores.remove(mark);
        }
        System.out.println(studentScores);




    }
}
