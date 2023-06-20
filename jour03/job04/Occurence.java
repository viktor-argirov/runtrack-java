public class Occurence {
    public static void main(String[] args) {
        int[] my_list = {3, 7, 3, 9, 8};

        System.out.println(number(my_list, 3));
    }

    public static int number(int[] list, int x) {
        int counter=0;
        for (int i=0; i< list.length; i++) {
            if (list[i] == x) {
                counter +=1;
            }
        }
        return counter;
    }
}
