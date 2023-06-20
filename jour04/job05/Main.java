package job05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input :
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int max_number = input.nextInt();

        // Counter :
        long start_time = System.nanoTime();
        System.out.println("Le programme commence"); 
        
        CounterThread first_thread = new CounterThread();
        CounterThread second_thread = new CounterThread();
        first_thread.run(max_number/2, 1);
        second_thread.run(max_number, (max_number/2) + 1);

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " millisecondes.");
    } 
    
}
