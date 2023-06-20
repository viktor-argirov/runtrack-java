import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you ? ");
        int age = input.nextInt();

        if (age < 16) {
            System.out.println("You're too young");
        }
        else if (age < 55) {
            System.out.println("You can work");
        }
        else if (age < 67) {
            System.out.println("It's difficult to find a job");
        }
        else {
            System.out.println("You can retire");
        }
    }
}
