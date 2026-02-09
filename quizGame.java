import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        String[] questions = {
            "How many keys are in Piano?",
            "Who is known as the father of Computer?",
            "What was the first high-level programming language?",
            "How many ASCII Characters are their?",
            "Who invented email?"
        };
        String[][] options = {
            {"1. 87 Keys", "2. 88 Keys", "3. 89 Keys"},
            {"1. Bill Gates", "2. Jeph Bezos", "3. Charles Babage"},
            {"1. Assembly", "2. FORTRAN", "3. C"},
            {"1. 128", "2. 130", "3. 162"},
            {"1. Ray Tomlison", "2. Paul Buchheit", "3. Brian Rakowski"}
        };
        int[] answers = {2, 3, 2, 1, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("Welcome to Java Quiz Game!");
        System.out.println("**************************");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess : ");
            guess = scanner.nextInt();
            if (guess == answers[i]) score++;
        }
        System.out.println("************");
        System.out.println("Quiz Ended!");
        System.out.println("************");
        System.out.printf("Score : %d/5\n", score);
        System.out.println("************");
        scanner.close();
    }
}
