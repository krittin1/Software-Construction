package hw2;

public class StatUtil {


    public static <T> double max(T[] elements, Measurer<T> meas) {

        double max = meas.measure(elements[0]);
        for (T e :  elements) {
            if ( max < meas.measure(e)){
                max = meas.measure(e);
            }
        }

        return max;
    }



}
