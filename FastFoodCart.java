import java.util.ArrayList;
import java.util.Scanner;

public class FastFoodCart {
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        char first = Character.toUpperCase(str.charAt(0));
        return first + str.substring(1);
    }   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cart = new ArrayList<>();
        String[] menu = {"Pizza", "Burger", "Fries", "PanCake", "Pastry", "Paties"};

        System.out.println("Menu:");
        for (String item : menu) {
            System.out.println(item);
        }

        while (true) {
            System.out.print("Enter item (or 'exit'): ");
            String item = scanner.nextLine();
            if (item.equals("exit")) break;

            boolean found = false;
            for (String menuItem : menu) {
                if (item.toLowerCase().equals(menuItem.toLowerCase())) {
                    cart.add(capitalize(menuItem));
                    found = true;
                    break;
                }
            }
            if (!found) System.out.println("Not on menu.");
        }

        System.out.println("Cart: " + cart);
        scanner.close();
    }
}   
