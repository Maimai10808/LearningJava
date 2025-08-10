import java.util.Random;

public class GenerateRandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int number;
        boolean isHeads;

        number = random.nextInt(1, 7);

        isHeads = random.nextBoolean();

        System.out.println(number);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
