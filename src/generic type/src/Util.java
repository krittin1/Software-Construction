import org.omg.CORBA.Object;

public class Util {
    public static boolean equals(Object o1, Object o2){
        return o1.equals(o2);
    }


    public static boolean equals(Student s1, Student s2){
        return  s1.getName().equals(s2.getName())
                && s1.getScore() == s2.getScore();

    }


    public static <T> boolean equals(Box<T> b1, Box<T> b2){
        return b1.get().equals(b2.get());
    }

    public static <K, V> boolean equals(Pair<K, V> p1, Pair<K, V> p2){
        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }



}
