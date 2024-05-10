import java.util.Random;
import java.util.Scanner;

public class Task_1_NumberGuessingGame {

    private static final int Min_Range = 1;
    private static final int Max_Range = 100;
    private static final int Max_Attempt = 10;
    private static final int Max_Rounds = 3;

    public static void main(String[] args)
    {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int TotalScore = 0;

        System.out.println("-----------------------NUMBER GUESSING GAME-----------------------");

        System.out.println("Total Number Of Rounds : 3");
        System.out.println("Attempts to Guess the number in each round : 10\n");
        System.out.println("******************************************************************");

        for (int i = 1; i <= Max_Rounds; i++)
        {
            int number = random.nextInt(Max_Range) + Min_Range;
            int attempts = 0;

            System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, Min_Range, Max_Range,
                    Max_Attempt);

            while (attempts < Max_Attempt)
            {
                System.out.println("Enter your guess : ");
                int guess_number = sc.nextInt();
                attempts = attempts + 1;

                if (guess_number == number)
                {
                    int score = Max_Attempt - attempts;
                    TotalScore = TotalScore + score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d. Round Score = %d\n",
                            attempts, score);

                    break;
                }

                else if (guess_number < number)
                {
                    System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,
                            (Max_Attempt - attempts));
                }

                else if (guess_number > number) 
                {
                    System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number,
                            (Max_Attempt - attempts));
                }

            }

            if (attempts == Max_Attempt) 
            {
                System.out.printf("\nRound = %d\n", i);
                System.out.println("Attempts = 0");
                System.out.printf("The Random Number is : %d\n\n", number);
            }
        }
        System.out.printf("Game Over. Total Score = %d\n", TotalScore);
        sc.close();
    }
}