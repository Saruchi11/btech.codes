class Vehicle {
    void run() {
        System.out.println("vehicle can run");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("car uses fuel");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric uses battery");
    }
}

public class inheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.run();
        e.fuel();
        e.battery();
    }
}