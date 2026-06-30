class Parent {
    void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display");
    }
    
    void show() {
        System.out.println("Child show");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();
        
        Child c = (Child) p;
        c.display();
        c.show();
    }
}
