//Moises Negrete
//lab #9



import java.util.Scanner;
import java.util.Random;

public class lab9 {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(20) + 1;
        // +1 because random only goes to number -1
        int numberGuessed;

        System.out.println("guess a number between 1 and 20: \n");
        numberGuessed = userinput.nextInt();

        while (numberGuessed < 1 || numberGuessed > 20) {

            System.out.println("error number is out of reach please enter number in range\n");
            numberGuessed = userinput.nextInt();

        }

        if (numberGuessed == randomNumber) {
            for (int i = 0; i < numberGuessed; i++) {
                System.out.println("you won you guessed correctly");

            }
        } 
	else if (numberGuessed < randomNumber) {
            System.out.println("your guess is less than my number: my number was " + randomNumber);
        }
       	else	{
            System.out.println("you lost the guess is higher than my number: my number was" + randomNumber);
        }
    }
  }
