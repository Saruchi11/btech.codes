import java.util.Scanner;
public class STUDENTDETAIL {
    static void showStudent(String name, int age, int rollNo) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        showStudent("saruchi", 18, 101);
        showStudent("vishav", 19, 102);
        showStudent("tanvi", 18, 103);
        showStudent("rahul", 20, 104);
        showStudent("mohit", 19, 105);
    }
}
