import java.util.Scanner;

public class AreaCalculatorUsingFunctions {
    public static double sqrArea(int side) {
        return side * side;
    }
    public static double rectArea(int wid, int ht) {
        return ht * wid;
    }
    public static double circArea(int radius) {
        return Math.PI * radius * radius;
    }
    public static double triArea(int wid, int ht) {
        return (ht * wid)/2;
    }
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
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Area = " + sqrArea(wid));
                    break;
                }
                case 2: {
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Enter height(cm) : ");
                    ht = scanner.nextDouble();
                    System.out.println("Area = " + rectArea(wid, ht));
                    break;
                }
                case 3: {
                    System.out.println("Enter radius(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Area = " + circArea(wid));
                    break;
                }
                case 4: {
                    System.out.println("Enter width(cm) : ");
                    wid = scanner.nextDouble();
                    System.out.println("Enter height(cm) : ");
                    ht = scanner.nextDouble();
                    System.out.println("Area = " + triArea(wid, ht));
                    break;
                }
                case 5: {
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
