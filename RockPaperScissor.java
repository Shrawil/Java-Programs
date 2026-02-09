//Rock Paper Scissor

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissor"};
        String botChoice = options[random.nextInt(3)];
        String userChoice;

        System.out.print("Enter your move (rock, paper, scissor) : ");
        userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals(botChoice)) System.out.println("Its a tie!");

        else if ((userChoice.equals("rock") && botChoice.equals("paper")) || (userChoice.equals("paper") && botChoice.equals("rock")) || (userChoice.equals("scissor") && botChoice.equals("paper"))) { 
            System.out.println("You won!"); 
        }

        else System.out.println("You lose!");
        scanner.close();
    }
}
