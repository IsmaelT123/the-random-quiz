import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuizBasics
{
    public static void main(String[] args) throws IOException {
        QuizMethods.language();
        QuizMethods.startOfQuiz();
        String[][] generalQAnswer = new String[1][3];    /*A sort of bank for answers to questions where the answer will not be needed
                                                         later on in the code(Only useful for the scenario it is used.)*/
        String[][] stringAnswer = new String[3][3];
        int[][] intAnswer = new int[3][3];
        System.out.println("What\'s up! How are you doing?");
        Scanner userFeeling = new Scanner(System.in);
        generalQAnswer[0][0] = userFeeling.nextLine();

        {
            switch (generalQAnswer[0][0]) {
                case "bad", "BAD", "Bad", "Terrible", "terrible", "Bad!", "Meh", "meh", "kinda bad", "Kinda Bad":
                    System.out.println("I'm sorry to hear that. Hopefully it gets better.");
                    break;
                case "Good", "good", "GOOD", "very good", "Very Good", "Very Good!", "Excellent", "Excellent!":
                    System.out.println("Great!");
            }
        }
        {
            System.out.println("What is your name?");
            Scanner userInput1 = new Scanner(System.in);
            String userName = userInput1.nextLine();
            QuizMethods.greeting(userName);
            System.out.println("Let's start the quiz! Press Enter:");
            Scanner userContinue = new Scanner(System.in);
            generalQAnswer[0][1] = userContinue.nextLine();
        }

        {
            System.out.println("\nStarting quiz......\nNote: If you want to see the instructions, type yes(NO CAPS). If not, just press enter.");
            Scanner startInstructions = new Scanner(System.in);
            generalQAnswer[0][2] = startInstructions.nextLine();
        }
        if (generalQAnswer[0][2].equals("yes")) {
            System.out.println("\n");
            try (BufferedReader instructionReader = new BufferedReader(new FileReader("Instructions.txt"))) {
                String textLine;
                while ((textLine = instructionReader.readLine()) != null) {
                    System.out.println(textLine);
                }
            }
            System.out.println("\nPress Enter to continue.");
            Scanner userContinue = new Scanner(System.in);
            String skipInstructions = userContinue.nextLine();
        } else {
            System.out.println("Ok");
        }
        {
        System.out.println("\nQuestion 1: Ready?");
        System.out.println("\nWhat is the difference between software and hardware?" +
                "\n1. One is more soft than the other" +
                "\n2. Software has more to do with digital things and hardware is the actual physical thing that allows software to run." +
                "\n3. Hardware is something you use to repair stuff and software is something you use to build stuff." +
                "\n4. I don't know, what is that?" +
                "\n5. Software is what my computer runs on, while hardware is where my computer stores files.");
        Scanner answerQ1 = new Scanner(System.in);
        stringAnswer[0][0] = answerQ1.nextLine();
        switch (stringAnswer[0][0])
        {
            case "2":
                ScoreCounter.correctAnswer();
                break;
            default:
                ScoreCounter.wrongAnswer();
        }
        }
        {
            System.out.println("\nQuestion 2:");
            System.out.println("How many operating systems make up most of the pc market share?");
            Scanner answerQ2 = new Scanner(System.in);
            String intAnswerQ2 = answerQ2.nextLine();
            switch (intAnswerQ2)
            {
                case "3", "Three", "three":
                    ScoreCounter.correctAnswer();
                    break;
                default:
                    ScoreCounter.wrongAnswer();
            }
        }
        {
            System.out.println("\nQuestion 3:");
            System.out.println("What is the third operating system? (Hint: Not Windows or MacOS)");
            Scanner answerQ3 = new Scanner(System.in);
            String stringAnswerQ3 = answerQ3.nextLine();
            switch(stringAnswerQ3)
            {
                case "Linux", "linux", "LINUX":
                    ScoreCounter.correctAnswer();
                    System.out.println("\nBonus Question:\nWhat is your favorite Linux distro?");
                    Scanner userInput3 = new Scanner(System.in);
                    String userLinuxDistro = userInput3.nextLine();
                    switch (userLinuxDistro)
                    {
                        case "Linux Mint", "linux mint", "LINUX MINT", "Mint", "mint", "MINT":
                            System.out.println("Same! I especially like how Cinnamon looks like and how it functions. " +
                                    "\nThe Mate desktop version of Mint is not my favorite, even though I don't mind the look, it doesn't work well on my computer.");
                            break;
                        case "None", "none", "I dont use Linux", "I don't use Linux", "I do not use Linux" , "I do not user linux", "I dont use linux", "I don't user linux":
                            System.out.println("Oh, ok. Then you probably are using Windows or MacOS. " +
                                    "\nThat's fine, but if you haven't tried Linux, and you want to learn something new, I would say you should give it a shot! (If your hardware supports it) " +
                                    "\nThere's more information on the internet if you are interested!");
                            break;
                        case "Ubuntu", "ubuntu", "UBUNTU":
                            System.out.println("I used to use Ubuntu, but i tried Linux Mint and personally, I like it better. " +
                                    "\nFunny story: An error in the installation of Ubuntu on my system forced me to download another distro, so I chose Linux Mint");
                            break;
                        default:
                            System.out.println("That is a terrible Distro! " +
                                    "\nJust kidding, they are all great, as long as it is something you enjoy using and it works for you!");
                    }
                    break;
                default:
                    ScoreCounter.wrongAnswer();
            }
        }
        {
            System.out.println("\nQuestion 4:");
            System.out.println("What is Java?" +
                    "\n1. A man who made computer code." +
                    "\n2. ?????????????????????????" +
                    "\n3. A programming language similar to human languages." +
                    "\n4. The programming language that this quiz is written in." +
                    "\n5. That thing that is on my computer, which I have no idea what it is." +
                    "\n6. A version of Minecraft!");
            Scanner answerQ4 = new Scanner(System.in);
            int intAnswerQ4 = answerQ4.nextInt();

            switch (intAnswerQ4)
            {
                case 4:
                    ScoreCounter.correctAnswer();
                    break;
                case 3:
                    ScoreCounter.wrongAnswer();
                    System.out.println("You are correct in the fact that it is a programming language, but it is not similar to human languages. " +
                            "\nHuman languages are used for communication, while programming languages are used to communicate with the computer.");
                    break;
                default:
                    ScoreCounter.wrongAnswer();
            }

        }
        {
            System.out.println("\nQuestion 5:");
            System.out.println("When did Microsoft released the Windows operating system?" +
                    "\n1. 1999" +
                    "\n2. 1899" +
                    "\n3. 1979" +
                    "\n4. 1988" +
                    "\n5. 1987" +
                    "\n6. 1985");
            Scanner answerQ5 = new Scanner(System.in);
            int intAnswerQ5 = answerQ5.nextInt();

            switch(intAnswerQ5)
            {
                case 6:
                    ScoreCounter.correctAnswer();
                    break;
                default:
                    ScoreCounter.wrongAnswer();
            }
        }
        {
            System.out.println("\nQuestion 6:");
            System.out.println("When was the first personal computer developed?" +
                    "\n1. 1990" +
                    "\n2. 1977" +
                    "\n3. 1974" +
                    "\n4. 1980" +
                    "\n5. 1979" +
                    "\n6. 1999");
            Scanner answerQ6 = new Scanner(System.in);
            int intAnswerQ6 = answerQ6.nextInt();
            switch(intAnswerQ6)
            {
                case 3:
                    ScoreCounter.correctAnswer();
                    break;
                default:
                    ScoreCounter.wrongAnswer();
            }
        }
        //Final Part of Quiz with score and final message
        {
            QuizMethods.randomQuizIntelligence();
            QuizMethods.finalMessage();             //Methods are in QuizMethods file
        }
    }

}
