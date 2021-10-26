import java.util.*;
public class ListMagic {
    public static void main(String[] args) //throws IOException
    {
        String w; int n;
        ArrayList<String> arrW = new ArrayList<String>();
        ArrayList<Integer> arrN = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter word, enter quit to end");
            w = sc.nextLine();
            if(w.equals("quit") == false)
                arrW.add(w);
        }while(w.equals("quit") == false);

        do{
            System.out.println("Enter num, enter negative num to end");
            n = sc.nextInt();
            if(n >= 0)
                arrN.add(n);
        }while(n >= 0);

        System.out.println(arrW);
        System.out.println(maxLength(arrW));
        removeDuplicates(arrW);
        System.out.println(arrW);
        switchPairs(arrW);
        System.out.println(arrW);

        System.out.println(arrN);
        System.out.println(range(arrN));
        System.out.println("Enter element, starting index, and ending index");
        int el = sc.nextInt();
        int st = sc.nextInt();
        int en = sc.nextInt();
        removeInRange(arrN, el, st, en);
        System.out.println(arrN);

        sc.close();
    }

    public static int maxLength(ArrayList<String> list)
    {
        int max = 0;
        for(String s: list) {
            if(s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }


    public static void removeDuplicates(ArrayList<String>list)
    {
        for (int i = 0; i<list.size(); i++) {
            for(int ii = list.size() - 1; ii>i; ii--) {
                if(list.get(i).equals(list.get(ii))) {
                    list.remove(ii);
                }
            }
        }
    }

    public static int range(ArrayList<Integer> list)
    {
        if(list.size() == 0)
            return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i: list) {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }
        return max - min + 1;
    }

    public static void switchPairs(ArrayList<String>list)
    {
        for (int i = 0; i<list.size() - 1; i+=2) {
            list.add(i, list.remove(i+1));
        }
    }

    public static void removeInRange(ArrayList<Integer> list, int val, int start, int stop)
    {
        for(int i=stop; i>=start; i--) {
            if (list.get(i) == val) {
                list.remove(i);
            }
        }
    }
}