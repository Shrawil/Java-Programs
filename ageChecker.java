import java.util.Scanner;

public class ageChecker {
    public static void main(String[] args) {

        //Age checker
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Hello " + name + " you are an adult!");
        }
        else {
            System.out.println("Hello " + name + " you are underage!");
        }
        scanner.close();
    }
}
