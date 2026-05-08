import java.util.Scanner;

class first {
    public static void main(String[] args) {

        // Comments in Java

        int num = 10; // Integer variable 
        double dec = 11.11; // Decimal variable
        char opr = '+'; // Character variable
        String name = "Shrawil"; // String is a set of characters terminated by a NULL character.

        // println adds a \n at the end so next print statement moves to next line.
        System.out.println("Num : " + num);
        System.out.println("Dec = " + dec);
        System.out.println("Opr = " + opr);
        //print add no next line at the end.
        System.out.print("Name : " + name);

        // Taking input in Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your name : ");
        name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
