package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents the Java Cafe program.
 */
public class JavaCafe {
    private Scanner scanner = new Scanner(System.in);
    public List<String> order = new ArrayList<String>();

    /**
     * Runs the Java Cafe program. (Mauin menu)
     */
    public void run() {
        while(true) {
            System.out.println("Welcome to Java Cafe!");
            System.out.println("1. View Food Menu");
            System.out.println("2. View Drink Menu");
            System.out.println("3. View Current Order");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewFoodMenu();
            } else if (choice.equals("2")) {
                viewDrinkMenu();
            } else if (choice.equals("3")) {
                viewCurrentOrder();
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the food menu and allows the user to add items to the order.
     */
    public void viewFoodMenu() {
        while(true) {
            System.out.println("Food Menu");
            System.out.println("1. Sandwich");
            System.out.println("2. Salad");
            System.out.println("3. Soup");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Sandwich");
            } else if (choice.equals("2")) {
                order.add("Salad");
            } else if (choice.equals("3")) {
                order.add("Soup");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the drink menu and allows the user to add items to the order.
     */
    public void viewDrinkMenu() {
        while(true) {
            System.out.println("Drink Menu");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Juice");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Coffee");
            } else if (choice.equals("2")) {
                order.add("Tea");
            } else if (choice.equals("3")) {
                order.add("Juice");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the current order.
     */
    public void viewCurrentOrder() {
        System.out.println("Current Order:");
        for (String item : order) {
            System.out.println(item);
        }
    }
}
