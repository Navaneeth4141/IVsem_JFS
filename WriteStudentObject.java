import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student implements Serializable{
    int id;
    String name;
    double marks;
    Student (int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class WriteStudentObject{
    public static void main(String[] args){
        Student s1 = new Student(101, "Navaneeth", 93.8);
        try{
            FileOutputStream file = new FileOutputStream("student.dat");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s1);
            out.close();
            file.close();
            System.out.println("Student object written successfully");
        } catch(IOException e){
            e.printStackTrace();
        }
        s1.display();
    }
}