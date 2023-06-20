package job03;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteThread extends Thread {
    public void run(String to_write) {
        try {
            FileWriter outfile = new FileWriter("output.txt", true);
            outfile.write(to_write);
            outfile.close();
            System.out.println("End");
        } catch (IOException x) {
            System.out.println("Error");
        }
    }
}
