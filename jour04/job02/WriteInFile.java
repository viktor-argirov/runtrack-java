import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {
    public static void main(String[] args) {
        // Counter :
        long start_time = System.nanoTime();
        System.out.println("Le programme commence");

        // We ask the length of the character string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int len_string = input.nextInt();

        String to_write = "";

        // We create a string
        for (int i=0; i<len_string;i++) {
            Random rnd = new Random();
            char c = (char) ('a' + rnd.nextInt(26));
            to_write += c;
        }

        try {
            FileWriter outfile = new FileWriter("output.txt", true);
            outfile.write(to_write);
            outfile.close();
        } catch (IOException x) {
            System.out.println("Error");
        }

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " ms");

    }

    
}
