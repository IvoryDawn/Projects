import java.util.Scanner;
class NumberGuessing
{
    public static void main(String args[])
    {
        int random = 1 + (int)(100 * Math.random());
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of guesses you wanna do : ");
        int number = sc.nextInt();
        boolean result = false;
        for(int i = 1; i <= number; i++)
        {
            System.out.println("Enter your guess : ");
            int guess = sc.nextInt();
            if(guess > random)
            {
                System.out.println("The number is less than "+guess);
            }
            else if(guess == random)
            {
                System.out.println("Congratulations ! , You guessed it correctly");
                result = true;
            }
            else
            {
                System.out.println("The number is greater than "+guess);
            }
            if(result)
            {
               break;
            }
        }
        if(result == false)
        {
            System.out.println("OOPS! You have exhaust the number of trials. The correct number was "+random);
        }
        sc.close();
    }
}