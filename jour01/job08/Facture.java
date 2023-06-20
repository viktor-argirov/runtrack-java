public class Facture {
    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float taxe = 0.2f;

        float prix_total = prix*quantite;
        float taxe_prix = prix_total*taxe;
        float total = prix_total + taxe_prix;

        System.out.println("Le montant total HT est " + prix_total);
        System.out.println("Le montant de la taxe est " + taxe_prix);
        System.out.println("Le montant total est " + total);
    }
}
