import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        // We create an empty array with its size
        int[] random_array = new int[10];

        // We create a random object
        Random number = new Random();

        for (int i=0; i<random_array.length; i++) {
            random_array[i] = number.nextInt(100);
            System.out.print(random_array[i] + " ");
        }
    }
}
