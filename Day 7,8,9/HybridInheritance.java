interface Engine {
    void start();
}

interface Wheels {
    void rotate();
}

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle implements Engine, Wheels {
    public void start() {
        System.out.println("Car engine started");
    }
    
    public void rotate() {
        System.out.println("Car wheels are rotating");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move();
        myCar.start();
        myCar.rotate();
    }
}
