import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class WriteNameToFile{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.nextLine();
		sc.close();
		try{
			FileWriter obj=new FileWriter("student.txt");
      			obj.write(name);
			System.out.println("hello my name is:"+name);
       			obj.close();
			System.out.println("Name Written Successfully");
		}
		catch (IOException e){
			System.out.print("An error occurred");
			e.printStackTrace();
		}
	}
}