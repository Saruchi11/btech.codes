class Student {
    private int marks;

    void setMarks(int m) {
        marks = m;
    }

    void display() {
        System.out.println(marks);
    }
}

public class encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(90);
        s.display();
    }
}