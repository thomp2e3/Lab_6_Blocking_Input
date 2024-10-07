import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Guess the number [1-10]: ");
            if (in.hasNext())
            {
                guess = Integer.parseInt(in.next());
                if (guess >= 1 && guess <= 10)
                {
                    done = true;
                } else {
                    System.out.println("Please enter a number between 1 and 10");
                }
            } else
            {
                trash = in.next();
                System.out.println(trash + "is not a valid number [1-10]");
            }
        } while (!done);

        System.out.println("The number was " + val);
        if (guess == val)
        {
            System.out.println("You guessed the number " + val + " correctly!");
        }
        else if (guess > val)
        {
            System.out.println("You guess was too high!");
        } else
            {
                System.out.println("You guess was too low!");
            }
        }
    }