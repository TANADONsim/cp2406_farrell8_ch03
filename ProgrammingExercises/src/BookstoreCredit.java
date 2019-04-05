import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String[] args)
    {
        String name = getName();
        double gpa = getGpa();
        double credit = calcCredit(gpa);
        displayMessage(name, gpa, credit);
    }
    public static Double getGpa()
    {
        double gpa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter GPA" );
        gpa = Double.parseDouble(input.nextLine());
        return gpa;
    }
    public static String getName()
    {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name" );
        name = input.nextLine();
        return name;
    }
    public static Double calcCredit(double gpa)
    {
        final double rate = 10;
        double credit = gpa * rate;
        return credit;
    }
    public static void displayMessage(String name, double GPA, double credit)
    {
        System.out.println("Student " + name + " of GPA " + GPA + " is awarded a store credit of $" + credit);
    }
}
