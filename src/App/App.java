package App;

import Order.OrderA;
import Order.OrderB;
import Outputter.Outputter;

import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);
    private static boolean continueWorking = true;
    private static OrderA orderA = new OrderA();
    private static OrderB orderB = new OrderB();
    private static Outputter outputter = new Outputter();


    public static void appStart() {
        while (continueWorking) {
            System.out.println("_____________________");
            displayMenu();
            try {
                int option = Integer.parseInt(sc.nextLine());
                switch (option) {
                    case 1 -> outputter.getOutput(orderA.toString());
                    case 2 -> outputter.getOutput(orderB.toString());
                    case 3 -> {
                        System.out.println("Have a good day!");
                        continueWorking = false;
                    }
                    default -> System.out.println("Enter correct number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }
        sc.close();
    }

    private static void displayMenu() {
        System.out.println("""
                Menu:
                1) Show order A
                2) Show order B
                3) Exit
                """);
    }
}
