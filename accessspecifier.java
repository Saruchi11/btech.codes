class Demo {
    public int a = 10;
    private int b = 20;

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class accessspecifier {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}