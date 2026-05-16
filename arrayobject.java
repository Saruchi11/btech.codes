class Student {
    int id;

    Student(int i) {
        id = i;
    }

    void display() {
        System.out.println(id);
    }
}

public class arrayobject {
    public static void main(String[] args) {

        Student s[] = new Student[2];

        s[0] = new Student(1);
        s[1] = new Student(2);

        s[0].display();
        s[1].display();
    }
}