import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id    = id;
        this.name  = name;
        this.marks = marks;
    }

    void show() {
        System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
    }
}

public class ListingStudents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> examList    = new ArrayList<>();
        ArrayList<Student> skillupList = new ArrayList<>();
        ArrayList<Student> skillnextList = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Enter ID    : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name  : ");
            String name = sc.nextLine();
            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();
            sc.nextLine();

            Student s = new Student(id, name, marks);
            examList.add(s);
        }

        for (Student s : examList) {
            if (s.marks > 75) {
                skillupList.add(s);
            } else {
                skillnextList.add(s);
            }
        }

        System.out.println("\n========== Exam List ==========");
        for (Student s : examList) {
            s.show();
        }

        System.out.println("\n========== Skill Up List (Marks > 75) ==========");
        if (skillupList.isEmpty()) {
            System.out.println("No students in this list.");
        } else {
            for (Student s : skillupList) {
                s.show();
            }
        }

        System.out.println("\n========== Skill Next List (Marks <= 75) ==========");
        if (skillnextList.isEmpty()) {
            System.out.println("No students in this list.");
        } else {
            for (Student s : skillnextList) {
                s.show();
            }
        }

        sc.close();
    }
}
