package programs;

import java.util.Scanner;


public class shoppingcart {
    public static void main (String[] args ){
        // Shopping cart program
   Scanner scanner = new Scanner(System.in);
    String item;
    float price;
    char currency = '₹';
    double total;

    System.out.print("What do you want:");
    item = scanner.nextLine();
    System.out.print("What was the price:");
    price = scanner.nextFloat();
    System.out.print("How many " + item + " do you want:");
    int quantity = scanner.nextInt();
    total = price * quantity;
    System.out.println("You want " + quantity + " " + item + "(s) " + " for a total of " + currency + total);


scanner.close();

    }
}
