//Mad Lib Game
import java.util.Scanner;

public class MadLibGame {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String adj1, adj2, verb1, verb2, noun1, noun2;

        System.out.print("Type a noun (name): ");
        noun1 = scanner.nextLine();
        System.out.print("Type an adjective (feeling): ");
        adj1 = scanner.nextLine();
        System.out.print("Type a verb (action ending with -ing): ");
        verb1 = scanner.nextLine();
        
        System.out.print("Type a noun (place): ");
        noun2 = scanner.nextLine();
        System.out.print("Type an adjective (feeling): ");
        adj2 = scanner.nextLine();
        System.out.print("Type a verb (action ending with -ing): ");
        verb2 = scanner.nextLine();
        
        System.out.println("Today I saw " + noun1 + " and they were " + adj1);
        System.out.println("They were " + verb1 + " at " + noun2);
        System.out.println("I was " + adj1 + " to see them");
        System.out.println("Everyone was " + verb2);

        scanner.close();
    }
}
