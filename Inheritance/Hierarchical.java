package Inheritance;

class Animal {
    void sleep() {
        System.out.println("Animal need sleep ");
    }
}

class Tiger extends Animal {

}

class Monkey extends Animal {

}

public class Hierarchical {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

        Monkey m = new Monkey();
        m.sleep();
    }

}
