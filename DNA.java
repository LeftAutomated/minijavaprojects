import java.util.Scanner;

public class DNA {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String dna_seq, dna_find;
        int dna_second, dna_third, dna_secondlast;

        System.out.print("Enter DNA Sequence:");
        dna_seq = input.nextLine();
        System.out.print("Enter DNA Sequence:");
        dna_find = input.nextLine();

        System.out.println("The sequence of " + dna_seq + " has the "+ dna_find + " appear at:");


        dna_second = dna_seq.indexOf(dna_find, dna_seq.indexOf(dna_find) + 1);
        dna_third = dna_seq.indexOf(dna_find, dna_second + 1);
        dna_secondlast = dna_seq.lastIndexOf(dna_find, dna_seq.lastIndexOf(dna_find) - 1);

        System.out.println("Second appearance:" + dna_second);
        System.out.println("Third appearance:" + dna_third);
        System.out.println("Second to last appearance:" + dna_secondlast);
    }
}
