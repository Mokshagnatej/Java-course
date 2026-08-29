package practice_programs;

import java.util.Scanner;

/**
 * ============================================================================
 * TOPIC: Practical Mini-Project — Interactive Retail Shopping Cart
 * FILE: shoppingcart.java
 * ============================================================================
 *
 * 🎯 GOAL / PROBLEM STATEMENT:
 * Build a terminal-based shopping cart checkout system that:
 *   1. Prompts user for the item name (`String`).
 *   2. Prompts user for the unit price (`float`).
 *   3. Prompts user for quantity purchased (`int`).
 *   4. Computes total cost: $\text{Total} = \text{Price} \times \text{Quantity}$.
 *   5. Displays an itemized receipt using a custom currency symbol (`₹`).
 *
 * 🧠 MENTAL MODEL & PROBLEM SOLVING WORKFLOW:
 *   • Step 1 (Input Definition): What data do we need from the user?
 *       - Item name (`String`), Unit price (`float`), Quantity (`int`).
 *   • Step 2 (Computation): Formula $\text{total} = \text{price} \times \text{quantity}$.
 *   • Step 3 (Presentation): Assemble string with currency symbol and formatted total.
 *
 * 🔍 LINE-BY-LINE BREAKDOWN:
 * - `Scanner scanner = new Scanner(System.in);` -> Binds input stream to terminal keyboard.
 * - `char currency = '₹';`                      -> Unicode character literal for Indian Rupee symbol.
 * - `item = scanner.nextLine();`                -> Captures item name (e.g. "Wireless Mouse").
 * - `price = scanner.nextFloat();`              -> Captures price per unit (e.g. 450.50).
 * - `int quantity = scanner.nextInt();`         -> Captures unit count (e.g. 2).
 * - `total = price * quantity;`                 -> Calculates bill.
 * - `scanner.close();`                          -> Closes input stream.
 *
 * 📊 SAMPLE DRY RUN / CONSOLE TRACE:
 * What do you want: Wireless Mouse
 * What was the price: 499.50
 * How many Wireless Mouse do you want: 2
 * Receipt Output: You want 2 Wireless Mouse(s) for a total of ₹999.0
 * ============================================================================
 */
public class shoppingcart {

    public static void main(String[] args) {
        // Initialize Scanner for keyboard input
        Scanner scanner = new Scanner(System.in);

        // Variable declarations
        String item;
        float price;
        char currency = '₹';
        double total;

        // Step 1: Read Item Name
        System.out.print("What do you want to buy: ");
        item = scanner.nextLine();

        // Step 2: Read Price Per Unit
        System.out.print("What is the price per item: ");
        price = scanner.nextFloat();

        // Step 3: Read Quantity
        System.out.print("How many " + item + " do you want: ");
        int quantity = scanner.nextInt();

        // Step 4: Calculate Total Cost
        total = price * quantity;

        // Step 5: Output Formatted Receipt Summary
        System.out.println("\n--- Order Summary ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Payable: %c%.2f%n", currency, total);

        // Step 6: Clean up scanner resource
        scanner.close();
    }
}
