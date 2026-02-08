import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        //Area Calculator
        int choice = 0;
        double ht = 0;
        double wid = 0;
        Scanner scanner = new Scanner(System.in);
        while (choice != 5) {
            System.out.println("Area Calculator!");
            System.out.println("1. Square\n2. Rectangle\n3. Circle\n4. Triangle\n5. Exit");
            
            System.out.println("Enter a number : ");
            choice =  scanner.nextInt();
            switch (choice) {
                case 1: {
                    //For Square we need only one side
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Area of square of width " + wid + "cm = " + (wid * wid) + "cm^2.");
                    break;
                }
                case 2: {
                    //For rectangle we need width and height
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Enter height(cm) : ");
                    ht = scanner.nextDouble();
                    System.out.println("Area of a rectangle of width " + wid + "cm and height " + ht + "cm = " + (wid * ht) + "cm^2.");
                    break;
                }
                case 3: {
                    //For circle we need radius (use wid as radius here my code my rules)
                    System.out.println("Enter radius(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Area of circle with radius " + wid + "cm = " + (Math.PI * (wid * wid)) + "cm.");
                    break;
                }
                case 4: {
                    //For triangle we need height and width
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Enter height(cm) : ");
                    ht = scanner.nextDouble();
                    System.out.println("Area of triangle with height " + ht + "cm and width " + wid + "cm = " + (ht * wid)/2 + "cm.");
                    break;
                }
                case 5: {
                    System.out.println("Bye bye.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
        scanner.close();
    }
}
