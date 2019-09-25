package hw1;

public class StatUtil {

    public static double max(Measurable[] objects) {
        double max = objects[0].getMeasure();
        for (Measurable obj : objects) {
            if ( max < obj.getMeasure()){
                max = obj.getMeasure();
            }
        }

      return max;
    }

}
