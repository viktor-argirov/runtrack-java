package job07;
import java.util.Scanner;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        // Input :
        Scanner input = new Scanner(System.in);
        System.out.print("Taille du tableau ? ");
        int size = input.nextInt();

        int[] list = new int[size];

        for (int i=0; i<size; i++) {
            Scanner value = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            int val = value.nextInt();
            list[i] = val;
        }

        // Counter :
        long start_time = System.nanoTime();
        System.out.println("Le programme commence"); 

        // Threads : 
        int[] first_string = Arrays.copyOfRange(list, 0, size/2);
        int[] second_string = Arrays.copyOfRange(list, size/2 + 1, size);

        SumThread first_thread = new SumThread();
        SumThread second_thread = new SumThread();
        int value1 = first_thread.run(first_string);
        int value2 = second_thread.run(second_string);
        int total = value1 + value2;
        System.out.println("Somme du tableau = " + total);

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " millisecondes.");
    }
}
