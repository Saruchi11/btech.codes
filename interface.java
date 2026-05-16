interface I1 {
    void show();
}
interface I2 {
    void display();
}
interface I3 {
    void print();
}
class Btech implements I1, I2, I3  {
    public void show() {
        System.out.println("show method:");

    }
    public void print() {
        System.out.println("Display method:");
    }
    public void display() {
        System.out.println("Print method:");
    }
    public static void main(String[] args){
        Btech b = new Btech();
        b.show();
        b.display();
        b.print();
     }
    }