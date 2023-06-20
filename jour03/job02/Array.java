import java.time.MonthDay;

public class Array {
    public static void main(String[] args) {
        int[] monTableau = {12, 6, 76, 98};

        for (int i=0; i < monTableau.length; i++) {
            System.out.println(monTableau[i]);
        }

        // To modify some values : 
        monTableau[0] = 0;
        System.out.println(monTableau[0]);

    }
}
