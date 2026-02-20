import java.io.FileWriter;
import java.io.IOException;

public class WriteNameToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("name.txt");
            writer.write("Navaneeth");
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}