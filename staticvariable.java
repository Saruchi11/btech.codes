class Count {
    static int x = 0;

    Count() {
        x++;
        System.out.println(x);
    }
}

public class staticvariable {
    public static void main(String[] args) {
        new Count();
        new Count();
    }
}
