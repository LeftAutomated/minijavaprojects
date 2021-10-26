import java.util.*;

public class Speed {
    public static void main(String[] args){

        double miles = calculateDistance(12);
        System.out.println(String.format("%.3f", miles));
    }

    public static double calculateDistance(int sec){
        return 343.0 / 1609.34 * sec;
    }
}
