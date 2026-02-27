import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class BranchCounter {
    public static void main(String args[]){ 
        int cse_counter = 0;
        int csm_counter = 0;
        int it_counter = 0;
        int ece_counter = 0;
        int ds_counter = 0;
        int other_counter = 0;
        try{
            File file = new File("roll.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				String roll = sc.nextLine();
                String branchcode = roll.substring(6,8);
                if(branchcode.equals("05")){
                    cse_counter++;
                } else if(branchcode.equals("66")){
                    csm_counter++;
                } else if (branchcode.equals("12")){
                    it_counter++;
                } else if (branchcode.equals("04")){
                    ece_counter++;
                } else if (branchcode.equals("67")){
                    ds_counter++;
                } else {
                    other_counter++;
                }
            }
            System.out.println("No of CSE Students : " + cse_counter);
            System.out.println("No of CSM Students : " + csm_counter);
            System.out.println("No of IT Students : " + it_counter);
            System.out.println("No of ECE Students : " + ece_counter);
            System.out.println("No of DS Students : " + ds_counter);
            System.out.println("No of Other Students : " + other_counter);
            sc.close();
        }
        catch (IOException e){
                System.out.println("An error occured");
                e.printStackTrace();
            }
    }
}