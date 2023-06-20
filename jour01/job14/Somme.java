import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Nombre 1 ? ");
        int nombre1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("Nombre 2 ? ");
        int nombre2 = input2.nextInt();

        int somme = nombre1 + nombre2;

        System.out.println("La somme est de " + somme);
    }
}
