class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

public class singleinheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}