import java.util.Comparator;
import java.util.List;

public class Data<T> {
    public static <T> T max(T a, T b, Comparator c ) {
        if (c.compare(a,b) > 0) return a;
        return b;
        //return  c.compare(a, b) > 0 ? a: b;
    }


    public static <T> T max(List<T> elements, Comparator<T> c){
        if (elements.size() == 0) return null;
        T m = elements.get(0);
        for (int i = 1; i < elements.size(); i++){
            m = max(m , elements.get(i), c);
        }
        return m;
    }

}
