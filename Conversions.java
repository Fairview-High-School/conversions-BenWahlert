import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Acres to Square Kilometers");
        System.out.println("8. Square Kilometers to Acres");
        System.out.println("9. Kilojoules to Watt Hours");
        System.out.println("0. Watt Hours to Kilojoules");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = (fahrenheit-32) * (5.0 / 9.0);
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees fahrenheit");
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.28084;
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*3.28084;
            System.out.println(feet + " meters is " + meters + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*29.574;
            System.out.println(feet + " ounces is " + meters + " milliliters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Ounces: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/29.574;
            System.out.println(feet + " ounces is " + meters + " milliliters");
        }
        if (selection == 7)
        {
            System.out.println("Enter Acres: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/247.1;
            System.out.println(feet + " acres is " + meters + " square kilometers");
        }
        if (selection == 8)
        {
            System.out.println("Enter Square Kilometers: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*247.1;
            System.out.println(feet + " square kilometers is " + meters + " acres");
        }
        if (selection == 9)
        {
            System.out.println("Enter Kilojoules: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet/3.6;
            System.out.println(feet + " kilojoules is " + meters + " watt hours");
        }
        if (selection == 0)
        {
            System.out.println("Enter Watt Hours: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet*3.6;
            System.out.println(feet + " watt hours is " + meters + " kilojoules");
        }
        
    }
}
