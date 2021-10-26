import java.util.Scanner;
import static java.lang.System.*;

public class Resize {
    public static void main(String args[])
    {
        //Finish the main method
        Scanner sc = new Scanner(System.in);
        out.println("Enter in original height then width");
        int startingHeight = sc.nextInt();
        int startingWidth = sc.nextInt();
        out.println("Enter in desired height and width");
        int endingHeight = sc.nextInt();
        int endingWidth = sc.nextInt();

        double actualWidth = getWidth(startingHeight, startingWidth, endingHeight);
        double actualHeight = getHeight(startingHeight, startingWidth, endingWidth);

        out.printf("%.2f by %.2f or %.2f by %.2f", (double)endingHeight, actualWidth, actualHeight, (double)endingWidth);

    }

    // Write the two methods
    public static double getWidth(int sH, int sW, int eH){
        return 1.00 * eH * sW / sH;
    }

    public static double getHeight(int sH, int sW, int eW){
        return 1.00 * eW * sH / sW;
    }
}