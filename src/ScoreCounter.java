public class ScoreCounter
{
    static int finalScore = 0;
    public static void correctAnswer()
    {
        System.out.println("Correct!");
        finalScore += add2Score();
    }
    public static void wrongAnswer()
    {
        System.out.println("Wrong.");
        finalScore += subtractFromScore();
    }
    private static int add2Score()
    {
        return 1;
    }
    private static int subtractFromScore()
    {
        return -1;
    }
    static int getFinalScore()
    {
        return finalScore;
    }
}
