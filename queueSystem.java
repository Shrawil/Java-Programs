import java.util.Scanner;

public class queueSystem {
    static int size = 5;
    static int front = -1, back = -1, val;

    public static boolean isFull() {
        if (back == size - 1) return true;
        return false;
    }
    public static boolean isEmpty() {
        return front == -1 || front > back;
    }
    public static int menu(Scanner scanner) {
        System.out.println("[]====Queue=System====[]");
        System.out.println("1. Print Queue        []");
        System.out.println("2. Add an element     []");
        System.out.println("3. Remove an element  []");
        System.out.println("4. Exit               []");
        System.out.println("[]====================[]");
        System.out.print("Choose an option : ");
        int choice = scanner.nextInt();
        return choice;
    }
    public static void printQ(int[] queue) {
        int i;
        if (front == -1 && back == -1) System.out.printf("\nFront : %d & Back : %d\n", front, back);
        for(i = 0; i < size; i++) {
            if (i == front) {
                System.out.print("Front\t");
            }
            else System.out.print("\t");
        }
        System.out.println();
        for(int Q : queue) { 
            System.out.printf("%d\t", Q);
        }
        System.out.println();
        for(i = 0; i < size; i++) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
        for(i = 0; i < size; i++) {
            if (i == back) {
                System.out.print("Back\t");
            }
            else System.out.print("\t");
        }
        System.out.println();
    }
    public static int[] addQ(int[] queue, Scanner scanner) {
        if(isFull()) {
            System.out.println("Queue is full!");
            return queue;
        }
        System.out.print("Enter a value to add : ");
        val = scanner.nextInt();
        if (front == -1) front = 0;
        queue[++back] = val;
        return queue;
    }
    public static int[] delQ(int[] queue) {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return queue;
        }
        System.out.printf("Removed element at front (%d) : %d!\n", front, queue[front]);
        queue[front++] = 0;
        if (front > back) {
            front = -1;
            back = -1;
        }
        return queue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] queue = new int[size];

        printQ(queue);
        
        while (true) {
            int option = menu(scanner);
            if (option == 1) {
                printQ(queue);
            }
            else if (option == 2) {
                queue = addQ(queue, scanner);
            }
            else if (option == 3) {
                queue = delQ(queue);
            }
            else if (option == 4) break;
            else System.out.println("Invalid Input!");
        }
        scanner.close();
    }
}
