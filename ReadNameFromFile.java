import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class ReadNameToFile{
	public static void main(String args[]){
		try{
			File file=new File("student.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()){
				String name=sc.nextLine();
				System.out.println(name);	
			}
			sc.close();
			System.out.print("Name Read Successfully.");
		}
		catch(IOException e){
			System.out.println("File Not Found.");
			e.printStackTrace();
		}
	}
}