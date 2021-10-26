import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String firstName, lastName, pigLatinFirstName, pigLatinLastName;
        char firstNameChar0, lastNameChar0, upperFirstNameChar1, upperLastNameChar1;

        System.out.print("Enter your name: ");
        firstName = sc.next();
        lastName = sc.next();
        firstNameChar0 = firstName.toLowerCase().charAt(0);
        lastNameChar0 = lastName.toLowerCase().charAt(0);
        upperFirstNameChar1 = firstName.toUpperCase().charAt(1);
        upperLastNameChar1 = lastName.toUpperCase().charAt(1);
        pigLatinFirstName = upperFirstNameChar1 + firstName.substring(2) + firstNameChar0 + "ay";
        pigLatinLastName = upperLastNameChar1 + lastName.substring(2) + lastNameChar0 + "ay";

        System.out.println("Hello, " + pigLatinFirstName + " " + pigLatinLastName);
    }
}
