package job06;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

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

        // int[] first_string = Arrays.copyOfRange(list, 0, size/2);
        // int[] second_string = Arrays.copyOfRange(list, size/2 + 1, size);

        // Sum (first_string);
        // Sum(second_string);

        Addition(list);

        // End of the counter : 
        long end_time = System.nanoTime();
        long delta_time = (end_time - start_time) / 1000000;
        System.out.println("Le programme a duré " + delta_time + " millisecondes.");
   
    }

    public static void Addition(int[] array) {
        int counter = 0;
        for (int i =0; i<array.length; i++) {
            counter += array[i];
        }

        System.out.println("Total : " + counter);
    }
}
