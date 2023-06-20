import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        int calcul;

        for (int i= 0; i<=10; i++) {
            calcul = i * number;
            System.out.println(i + " x " + number + " = " + calcul);
        }
    }
}
