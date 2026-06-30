class Calculation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));

        Animal myAnimal = new Animal();
        myAnimal.sound();

        Animal myCat = new Cat();
        myCat.sound();
    }
}
