import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNameToFile {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            FileWriter writer = new FileWriter("name.txt");
            System.out.print("Enter your message : ");
            writer.write(sc.nextLine());
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}