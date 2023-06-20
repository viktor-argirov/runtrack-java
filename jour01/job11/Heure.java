import java.util.Scanner;

public class Heure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes : ");
        int minutes = input.nextInt();

        int heure = minutes / 60;
        int reste = minutes % 60;

        System.out.println("Votre durée est équivalente à " + heure + " heures et " + reste + " minutes");
    }
}
