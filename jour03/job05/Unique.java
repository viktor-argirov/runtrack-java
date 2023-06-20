/*import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        int[] my_list = {3, 7, 3, 9, 8};

        Integer array = unique_list(my_list);


    }

    public static Integer[] unique_list (int[] list) {
        // We create an empty ArrayList
        ArrayList<Integer> new_list = new ArrayList<Integer>();

        // We add the unique value in the Arraylist
        for (int i=0; i< list.length; i++) {
            if (new_list.contains(list[i])) {
                continue;
            }
            else {
                new_list.add(list[i]);
            }
        }

        // We return the new list
        Integer[] final_list = new Integer[new_list.size()];
        final_list = new_list.toArray(final_list);
        return final_list;
    }
} */

// Problem with the Arraylist and Integer, but the principle should work. I've tried an other way

public class Unique {
    public static void main(String[] args) {
        int[] my_list = {0, 7, 3, 9, 8, 8, 3, 6};
        int my_list_length = my_list.length;

        unique_list(my_list, my_list_length);
    }

    public static void unique_list(int[] array, int array_len) {
        for (int i=0; i < array_len; i++) {
            for (int j=0; j<array_len; j++) {
                // System.out.println("Index " + i + " : " + array[i]);
                // System.out.println("Index j " + j + " : " + array[j]);
                if  (array[i] == array[j]) {
                    // System.out.print("// ");
                    break;
                }
                // System.out.println(i + "i");
                // System.out.println(j + "j"); // I don't understand why I haven't the index 0i in the print
                if ((i-1)==j) {
                    System.out.println(array[i] + " ");
                }
                
                
            }
        }
    }
}

/*  This program doesn't completly work. The first value will not appear, even if it is two or three times in the list.
I have no idea what this doesn't work. I made a lot of test to understand, I have let the test lines (in comments)
*/