import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadNameFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("name.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}