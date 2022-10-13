import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //first string
        System.out.println("Please enter the first string: ");
        String string1 = scan.nextLine();

        int string1Length = string1.length();
        System.out.println("String Length: " + string1Length);

        int halfLength = string1Length / 2;

        String firstHalf = string1.substring(0,halfLength);
        String secondHalf = string1.substring(halfLength);
        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);

        //second string
        System.out.println("Please enter the second string: ");
        String string2 = scan.nextLine();

        int string2Length = string2.length();
        if (string1Length > string2Length) {
            System.out.println(string1 + " is longer.");
        }
        else if (string2Length > string1Length) {
            System.out.println(string2 + " is longer.");
        } else {
            System.out.println("They both have the same length.");
        }

        if (string1.equals(string2)) {
            System.out.println("Both strings have the same exact characters.");
        } else {
            int compare1 = string1.compareTo(string2);
            if (compare1 < 0) {
                System.out.println(string1 + " is first alphabetically.");
            } else {
                System.out.println(string2 + " is first alphabetically.");
            }
        }

        int indexOfSecondStr = string1.indexOf(string2);
        if (indexOfSecondStr != -1) {
            System.out.println(string2 + " is found in " + string1 + " at index " + indexOfSecondStr);
        } else {
            System.out.println(string2 + " is not found in " + string1);
        }




    }
}
