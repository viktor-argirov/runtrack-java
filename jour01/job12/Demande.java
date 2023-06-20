import java.util.Scanner;;

public class Demande {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Chaine 1 ? ");
        String chaine1 = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Chaine 2 ? ");
        String chaine2 = input2.nextLine();

        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, (chaine1.length() - chaine2.length()));
        chaine1 = chaine1.substring(chaine2.length()); /* De cette position jusqu'à la fin */

        System.out.println("Chaine 1 : " + chaine1);
        System.out.println("Chaine 2 : " + chaine2);
    }
}
