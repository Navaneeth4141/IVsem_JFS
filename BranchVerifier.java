import java.util.*;

public class BranchVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter batch code: ");
        String batch = sc.next().trim().toUpperCase();

        if (isValidBatch(batch)) {
            System.out.println("Valid batch");
            System.out.println(batch + " - " + getBatchName(batch));
        } else {
            System.out.println("Invalid batch");
        }

        sc.close();
    }

    static boolean isValidBatch(String batch) {
        // Must be exactly 3 characters long
        if (batch.length() != 3) return false;

        // First character must be 'S'
        if (batch.charAt(0) != 'S') return false;

        // Second character must be 'U', 'N', or 'B'
        char type = batch.charAt(1);
        if (type != 'U' && type != 'N' && type != 'B') return false;

        // Third character must be a digit between '1' and '6'
        char num = batch.charAt(2);
        if (num < '1' || num > '6') return false;

        return true;
    }

    static String getBatchName(String batch) {
        // Resolve type prefix
        String typeName;
        switch (batch.charAt(1)) {
            case 'U': 
                typeName = "Skill Up";     
                break;
            case 'N': 
                typeName = "Skill Next";   
                break;
            case 'B': 
                typeName = "Skill Bridge"; 
                break;
            default:  
                typeName = "";
        }

        // Resolve number word
        String numWord;
        switch (batch.charAt(2)) {
            case '1': 
                numWord = "One";   
                break;
            case '2': 
                numWord = "Two";   
                break;
            case '3': 
                numWord = "Three"; 
                break;
            case '4': 
                numWord = "Four";  
                break;
            case '5': 
                numWord = "Five";  
                break;
            case '6': 
                numWord = "Six";   
                break;
            default:  
                numWord = "";
        }

        return typeName + " " + numWord;
    }
}
