import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double Celsius = 0;
        double Fahrenheit = 0;
        String badInput;

        
        System.out.print("Enter the degrees in Celsius: ");
        Celsius = scanner.nextInt();
        scanner.nextLine();
        Fahrenheit = ((Celsius * 9/5) + 32);

        {
            if (Celsius == 0)
            {
                System.out.println("This is the freezing point!");
                System.out.println("The converted tempterature to Fahrenheit is " + Fahrenheit);
            }
            else if (Celsius == 100)
            {
                System.out.println("This is the boiling point!");
                System.out.println("The converted tempterature to Fahrenheit is " + Fahrenheit);
            }
            else
            {
                System.out.println("Error, Bad input");
                System.exit(0);
            }
        }
    }
}
