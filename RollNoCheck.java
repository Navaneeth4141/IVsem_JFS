import java.util.*;
public class RollNoCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number to verify : ");
        String rollno = sc.next().toUpperCase();
        if(isValid(rollno)) {
            System.out.println(name(rollno));
        } else {
            System.out.println("Invalid Roll Number");
        }
    }
    static boolean isValid(String rollno) {
        if(rollno.length() != 10) return false;
        return true;
    }

    static String name(String rollno) {
        String name = "";
        if(rollno.substring(4,6).equals("1A")){
            name = name + "Regular B.Tech";
        } else {
            name = name + "Lateral B.Tech";
        }
        String branchCode = rollno.substring(6,8);
        String branchname;
        switch(branchCode){
            case "01" : 
                branchname = "CIVIL";
                break;
            case "02" :
                branchname = "EEE";
                break;
            case "03" : 
                branchname = "MECH";
            case "04" : 
                branchname = "ECE";
                break;
            case "05" : 
                branchname = "CSE";
                break;
            case "62" : 
                branchname = "CS";
                break;
            case "66" : 
                branchname = "CSM";
                break;
            case "67" : 
                branchname = "DS";
                break;
            case "33" : 
                branchname = "CSIT";
                break;
            case "12" : 
                branchname = "IT";
                break;
            case "21" : 
                branchname = "AERO";
                break;
            default : 
                branchname = "";
                break;
        }
        return name + " " + branchname;
    }
}