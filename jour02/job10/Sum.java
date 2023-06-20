public class Sum {
    public static void main(String[] args) {
        int a = 1234;
        String b = Integer.toString(a);
        int length = b.length();
        int c = 10;
        int d = 0;
        int total = 0;

        for (int i=0; i<length; i++) {
            d = a % c;
            a = a - (a % c);
            d = d / (c/10);
            total += d;
            c = c*10; 
        }

        System.out.println(total);
    }
}
