import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        double num1 = input.nextInt();
        System.out.println("As 1 inch is equal to 2.54cm, the value entered converted from inches to centimeters is " );
        convertInches(num1);
        System.out.println("As 1 gallon is equal to 3.7854 litres, the value entered converted from gallons to litres is " );
        convertGallons(num1);
    }
    public static void convertInches(double num)
    {
        double result = num * 2.54;
        System.out.println(result);
    }
    public static void convertGallons(double num)
    {
        double result = num * 3.7854;
        System.out.println(result);
    }

}
