import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadNameFromFileScanner {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the filename : ");
            Scanner sc = new Scanner(System.in);
            String filename = sc.nextLine();
            File file = new File(filename);
            Scanner sc1 = new Scanner(file);
            while(sc1.hasNextLine()){
                String s = sc1.nextLine();
                System.out.println(s);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}