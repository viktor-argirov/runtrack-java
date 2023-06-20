package job03;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // We ask the length of the character string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int len_string = input.nextInt();

         // Counter :
         long start_time = System.nanoTime();
         System.out.println("Le programme commence");

        String to_write = "";

        // We create a string
        for (int i=0; i<len_string;i++) {
            Random rnd = new Random();
            char c = (char) ('a' + rnd.nextInt(26));
            to_write += c;
        }

        String string1 = to_write.substring(0, len_string/2);
        String string2 = to_write.substring((len_string/2) + 1);

        WriteThread first_thread = new WriteThread();
        first_thread.run(string1);

        WriteThread second_thread = new WriteThread();
        second_thread.run(string2);

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " millisecondes.");
    }
}
