import java.lang.*;
import java.util.*;
import java.io.*;

public class CoolProgram05 {
    static Scanner sc = new Scanner(System.in);
    static int a, b, c, d, answer;

    public static void myNums(int n){
        if(n == 2)
            System.out.println("Please enter two integers");
        else if(n == 3)
            System.out.println("Please enter three integers");
        else if(n == 4)
            System.out.println("Please enter four integers");
        a = sc.nextInt();
        b = sc.nextInt();
        if(n >= 3)
            c = sc.nextInt();
        if(n == 4)
            d = sc.nextInt();
    }

    public static void P01(){
        System.out.println("<Sum>");
        myNums(3);
        answer = a + b + c;
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P02(){
        System.out.println("<Sum of Squares>");
        myNums(3);
        answer = (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P03(){
        System.out.println("<Sum of Cubes>");
        myNums(3);
        answer = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P04(){
        System.out.println("<Cube of Sum>");
        myNums(3);
        answer = (int)(Math.pow(a + b + c, 3));
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P05(){
        System.out.println("<5 to Each & Product>");
        myNums(4);
        answer = (a+5) * (b+5) * (c+5) * (d+5);
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P06(){
        System.out.println("<Largest of 2>");
        myNums(2);
        answer = Math.max(a, b);
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P07() {
        System.out.println("<Largest of 3>");
        myNums(3);
        answer = Math.max( Math.max(a, b), c );
        System.out.println("The answer is " + answer + "\n");
    }

    public static void P08(){
        System.out.println("<Largest of 4>");
        myNums(4);
        answer = Math.max(Math.max(Math.max(a,b), c), d);
        System.out.println("The answer is " + answer + "\n");
    }
    public static void main(String[] args){
        P01();
        P02();
        P03();
        P04();
        P05();
        P06();
        P07();
        P08();
    }
}
