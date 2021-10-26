import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Election
{
    public static void P01(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a state abbreviation");
        String abrev = sc.nextLine();
        int total = 0;

        switch(abrev){
            case "AL": total += 9; break;
            case "AK": total += 3; break;
            case "AZ": total += 11; break;
            case "AR": total += 6; break;
            case "CA": total += 55; break;
            case "CO": total += 9; break;
            case "CT": total += 7; break;
            case "DE": total += 3; break;
            case "FL": total += 29; break;
            case "GA": total += 16; break;
            case "HI": total += 4; break;
            case "ID": total += 4; break;
            case "IL": total += 20; break;
            case "IN": total += 11; break;
            case "IA": total += 6; break;
            case "KS": total += 6; break;
            case "KY": total += 8; break;
            case "LA": total += 8; break;
            case "ME": total += 4; break;
            case "MD": total += 10; break;
            case "MA": total += 11; break;
            case "MI": total += 16; break;
            case "MN": total += 10; break;
            case "MS": total += 6; break;
            case "MO": total += 10; break;
            case "MT": total += 3; break;
            case "NE": total += 5; break;
            case "NV": total += 6; break;
            case "NH": total += 4; break;
            case "NJ": total += 14; break;
            case "NM": total += 5; break;
            case "NY": total += 29; break;
            case "NC": total += 15; break;
            case "ND": total += 3; break;
            case "OH": total += 18; break;
            case "OK": total += 7; break;
            case "OR": total += 7; break;
            case "PA": total += 20; break;
            case "RI": total += 4; break;
            case "SC": total += 9; break;
            case "SD": total += 3; break;
            case "TN": total += 11; break;
            case "TX": total += 38; break;
            case "UT": total += 6; break;
            case "VT": total += 3; break;
            case "VA": total += 13; break;
            case "WA": total += 12; break;
            case "WV": total += 5; break;
            case "WI": total += 10; break;
            case "WY": total += 3; break;
        }

        System.out.println("Total: " + total);
    }

    public static void P02(){

    }

    public static void P03(){

    }

    public static void P04(){

    }

    public static void P05(){

    }

    public static void P06(){

    }

    public static void P07(){

    }

    public static void main(String[] args){
        P01();
        P02();
        P03();
        P04();
        P05();
        P06();
        P07();
    }
}