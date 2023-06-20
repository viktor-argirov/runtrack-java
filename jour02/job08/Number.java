import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String numero = input.next();

        int len = numero.length();
        System.out.println(numero + " : " + len);

    }
}
