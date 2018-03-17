package IntroToJava;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{

    public static void main(String[] args)
    {
        int count = 1;
        Object randomNum;
        int input = 0;

        do
        {
            Random rand = new Random();
            randomNum = rand.nextInt(10)+1;

            System.out.println("Please input a number to guess: ");
            Scanner keyboard = new Scanner(System.in);

            try
            {
                input = keyboard.nextInt();

                if (input < 1 || input > 10)
                {
                    throw new BadGuessException();
                }

                else if (!randomNum.equals(input))
                {
                    count += 1;
                }
                else
                {
                    System.out.println("YOU GOT IT!");
                    System.out.println("You attempted " + count + " times");
                }

            }
            catch (InputMismatchException e )
            {
                System.out.println("Please enter integers only");
            }
            catch (BadGuessException e)
            {
                System.out.println(e.getMessage());
            }

        } while (!randomNum.equals(input));

    }

}
