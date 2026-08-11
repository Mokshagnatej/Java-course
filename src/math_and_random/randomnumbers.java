import java.util.Random;

public class randomnumbers {
    public static void main(String[] args){
        Random random = new Random();
        // generate random integers
        int number;
        number = random.nextInt(10, 200);
        System.out.print(number);

    }
}
