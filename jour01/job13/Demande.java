import java.util.Scanner;

public class Demande {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre ? ");
        int nombre = input.nextInt();

        for (int i = 1; i <= nombre; i++) {
            System.out.println(i);
        }
    }
}
