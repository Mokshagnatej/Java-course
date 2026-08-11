package input_output;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = scanner.nextLine();
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.print("Your height:");
        double height = scanner.nextDouble();
        System.out.print("The person name is " + name + " " + "his age is" + " " + age + " " + "years " + "and his height is" + " " + height + " " + "feet");
        scanner.close();
    }
}
