import java.util.Scanner;

public class Demande {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Nom ? ");
        String nom = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Prénom ? ");
        String prenom = input2.nextLine();

        System.out.println("Vous vous appelez " + prenom + " " + nom);
    }
}
