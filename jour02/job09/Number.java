public class Number {
    public static void main(String[] args) {
        int a = 1234;
        String b = Integer.toString(a);

        char first_char = b.charAt(0);
        char last_char = b.charAt(b.length() - 1);

        System.out.println("First character : " + first_char);
        System.out.println("Last character : " + last_char);

    }
}
