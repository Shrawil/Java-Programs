import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNum = random.nextInt(1, 100+1);
        int guess;
        //System.out.println(secretNum);
        while (true) {
            System.out.print("Enter your guess 1 - 100 : ");
            guess = scanner.nextInt();
            if (guess == secretNum) {
                System.out.println("You Won!");
                break;
            }
            else if (guess > secretNum) {
                System.out.println("Guessed number is greater than secret number!");
            }
            else {
                System.out.println("Guessed number is smaller than secret number!");
            }
        }
        scanner.close();
    }
}
