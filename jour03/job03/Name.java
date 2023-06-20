import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Name {
    public static void main(String[] args) {
        String[] name = {"Josette", "John", "Myrtille", "Marc"};

        // We convert the array to an ArrayList
        List<String> name_list = new ArrayList<String>();
        for (String i:name) {
            name_list.add(i);
        }

        System.out.println("All names: " + name_list);
        
        // We search John
        int index_john = name_list.indexOf(("John"));
        System.out.println(name[index_john]);

        int index_myrtille = name_list.indexOf(("Myrtille"));
        name[index_myrtille] = "Mireille";
        for (String i:name) {
            System.out.print(i + ", ");
        }

    }
}
