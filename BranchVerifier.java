import java.util.*;

public class BranchVerifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter batch code: ");
        String batch = sc.next().toUpperCase();

        if (isValidBatch(batch)) {
            System.out.println("Valid batch");
        } else {
            System.out.println("Invalid batch");
        }

        sc.close();
    }

    static boolean isValidBatch(String batch) {
        if (batch.length() != 3) return false;

        if (batch.charAt(0) != 'S') return false;

        char type = batch.charAt(1);
        if (type != 'U' && type != 'N' && type != 'B') return false;

        char num = batch.charAt(2);
        if (num < '1' || num > '6') return false;

        return true;
    }
}
