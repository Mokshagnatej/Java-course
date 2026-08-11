// we have to use below line scanner class
import java.util.Scanner;
public class scanner {
    public scanner() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = scanner.nextLine();
        //System.out.println("The person name is " + name );
        System.out.print("Enter your age:");
        int age = scanner.nextInt();
        System.out.print("Your height:");
        double height = scanner.nextDouble();
        System.out.print("The person name is " + name + " " + "his age is" + " " + age + " " + "years " + "and his height is" + " " + height + " " + "feet");


        scanner.close();
    }
}

/*
comman problem in the scanner class is that after using nextInt() or nextDouble() method if we use nextLine() method it will be skipped
 */