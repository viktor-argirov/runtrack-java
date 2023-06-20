public class Sum {
    public static void main(String[] args) {
        int counter = 0;

        for (int i=0; i<=100; i++) {
            if (i % 2 == 0) {
                counter += i;
            }
        }

        System.out.println(counter);
    }
}
