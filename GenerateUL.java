import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class GenerateUL {
    public static List<Integer> generateUniqueList(List<Integer> inputList) {
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer item : inputList) {
            if (!uniqueList.contains(item)) {
                uniqueList.add(item);
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        

        System.out.println("Original List : " + numbers);

        List<Integer> uniqueNumbers = generateUniqueList(numbers);

        System.out.println("Unique List   : " + uniqueNumbers);
    }
}
