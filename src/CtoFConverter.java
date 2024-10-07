import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
    {
        double tempC = 0;
        double tempF = 0;
        String trash = "";

        boolean temp = true;

        do {
            System.out.println("Enter the temperature in Celsius: ");

               if (in.hasNextDouble())
               {
                   tempC = in.nextDouble();
                   tempF = tempC * 1.8 + 32;
                   System.out.println("The temperature in Fahrenheit is " + tempF);
                   temp = true;
               }
               else
               {
                   trash = in.nextLine();
                   System.out.println("Please enter a valid temperature.");
                   temp = false;
               }
           }while (!temp);

        }
    }
}