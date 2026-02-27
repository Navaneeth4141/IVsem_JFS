import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNameToFileScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number of names? " );
        int nn = sc.nextInt();
	sc.nextLine();
        try {
            FileWriter writer = new FileWriter("name.txt", true);
            for(int i = 1; i <= nn; i++) {
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            writer.write(name + "\n");
            }
            writer.close();
	        sc.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}