import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double height = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        Boolean done = false;



        do{
            System.out.println("Enter the height of the rectangle: ");
            if (in.hasNextDouble())
            {
                height = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input '" + trash + "'. Try again and enter a valid number");
            }
        }while(!done);

        done = false;

        do {
            System.out.println("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                done = true;
            }
            else
            {
                trash = in.next();
                System.out.println("Invalid input '" + trash + "'. Try again and enter a valid number");
            }
        } while (!done);

        area = (width * height);
        perimeter = (2 * (width * height));
        diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println( "The area of the rectangle is " + area);
        System.out.println( "The perimeter of the rectangle is " + perimeter);
        System.out.println( "The diagonal of the rectangle is " + diagonal);


    }
}
