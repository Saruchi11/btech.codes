abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car Starts");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}

