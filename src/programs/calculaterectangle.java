package programs;

import java.util.Scanner;
public class calculaterectangle {
    public static void main(String[] args) {
// calculate area of rectangle
        double width;
        double height;
        double area;

 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the width of the rectangle:");
 width = scanner. nextDouble();
 System.out.print("Enter the height of the rectangle:");
 height = scanner. nextDouble();

 area = width * height;
    System.out.println("The area of the rectangle is: " + area + "cm");


scanner.close();

    }
}
