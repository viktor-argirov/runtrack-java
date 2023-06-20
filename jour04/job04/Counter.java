package job04;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int max_number = input.nextInt();

         // Counter :
         long start_time = System.nanoTime();
         System.out.println("Le programme commence");

        for (int i=1; i<=max_number; i++) {
            System.out.println(i);
        }

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " millisecondes.");

    }
}
