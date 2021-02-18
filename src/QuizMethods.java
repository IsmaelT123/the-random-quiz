import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizMethods
{
    public static void language()
    {
        System.out.println("Language/Lenguage:\n1.English\t\t2.Español");
        Scanner languageInput = new Scanner(System.in);
        int chosenLanguage = languageInput.nextInt();
        if(chosenLanguage == 2)
        {
            QuizBasics_Spanish.mainSpanish();   //gets the method mainSpanish() from the QuizBasics_Spanish Class
        }
    }
    public static void startOfQuiz() throws FileNotFoundException
    {
        System.out.println("\nWelcome to The Random Quiz V1.0! \n\nNote that I cant stop you from cheating on this quiz. " +
                "\nIf you do decide to cheat, just keep in mind that it ruins the main objective of this quiz, which is to test your knowledge." +
                "\nTo continue to the Quiz, press enter.");
        Scanner userStart = new Scanner(System.in);
        String continueFromWelcome = userStart.nextLine();

    }
    public static void greeting(String nameOfUser)
    {
        System.out.println("Hello " + nameOfUser + "!");
    }
    public static void randomQuizIntelligence()
    {
        System.out.println("\nYour Technology Intelligence is:");
        System.out.println(ScoreCounter.getFinalScore());   //gets the final score that was added up from the method getFinalScore() from the ScoreCounter Class
    }
    static void finalMessage()
    {
        System.out.println("\nThank you for playing! " + "\nHave a great day!");
    }
}
