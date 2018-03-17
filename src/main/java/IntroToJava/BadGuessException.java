package IntroToJava;


public class BadGuessException extends Exception
{

    public BadGuessException()
    {
        super("Sorry, that was an invalid guesss. Guess again!\n");
    }


}
