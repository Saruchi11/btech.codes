class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class runtimepolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}