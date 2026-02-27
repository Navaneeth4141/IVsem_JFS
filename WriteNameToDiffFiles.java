import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteNameToDiffFiles{
    public static void main(String args[]){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        sc.nextLine();
        int j = 0;
        FileWriter cse = new FileWriter("cse.txt");
        FileWriter csm = new FileWriter("csm.txt");
        FileWriter it = new FileWriter("it.txt");
        FileWriter ece = new FileWriter("ece.txt");
        FileWriter ds = new FileWriter("ds.txt");
            while(j < n){
                System.out.print("Enter roll number : ");
                String roll = sc.nextLine();
                String branchcode = roll.substring(6,8);
                if(branchcode == "05"){
                    cse.write(roll + "\n");
                }
                if(branchcode == "66"){
                    csm.write(roll + "\n");
                }
                if(branchcode == "12"){
                    it.write(roll + "\n");
                }
                if(branchcode == "04"){
                    ece.write(roll + "\n");
                }
                if(branchcode == "67"){
                    ds.write(roll + "\n");
                }
                j++;
                cse.close();
                csm.close();
                it.close();
                ece.close();
                ds.close();
            }
            System.out.println("Entered the Roll no's into the respective files");
        }catch(IOException e){
                System.out.print("An error occured");
                e.printStackTrace();
        }
    }
}