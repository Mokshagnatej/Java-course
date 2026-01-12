package ifstatements;
import  java.util.Scanner;
public class ifstatement {
    public static void main (String[] args){
        //if statememts- is a block of code
        // that will execute if a specified condition is true

      Scanner scanner = new Scanner(System.in);
       String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");

        age  = scanner.nextInt();
        System.out.println("are you a student(true/false)");
        isStudent = scanner.nextBoolean();

        //Group1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello"+ name + "!");
        }

       // Group2


         if ( age >=60) {
             System.out.println("your a senior citizen");
         }
         else if (age >=18) {
            System.out.println("your adult ");
        }
         else {
             System.out.println("your not an adult 👦🏻");
         }
         //Group3
        if(isStudent){
            System.out.println("Your are a student!");
        }
        else{
            System.out.println("Your not a student!");
        }
         scanner.close();
      
        }
    }

