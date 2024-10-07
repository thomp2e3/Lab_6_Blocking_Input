import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        {
            double gasTank = 0;
            double fuelEff = 0;
            double gasPrice = 0;
            double costMiles = 0;
            double fullTank = 0;

            boolean fuel = false;

            do {
                System.out.println("Enter how many gallons of gas are in the tank: ");
                gasTank = in.nextDouble();
                System.out.println("Enter the car's fuel efficiency in miles per gallon: ");
                fuelEff = in.nextDouble();
                System.out.println("Enter the price of gas per gallon: ");
                gasPrice = in.nextDouble();

                costMiles = (100 / fuelEff) * gasPrice;
                fullTank = gasTank * fuelEff;

                fuel = true;
            } while (!fuel);


            System.out.println("The cost to drive 100 miles is: " + costMiles);
            System.out.println("The car can drive '" + fullTank + "' miles");

        }
    }
}