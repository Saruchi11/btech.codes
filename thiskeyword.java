class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    void show() {
        System.out.println(id);
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Student s = new Student(5);
        s.show();
    }
}