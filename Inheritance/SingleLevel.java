package Inheritance;

class Animal {
    void sleep() {
        System.out.println("Animal need sleep ");
    }
}

class Tiger extends Animal {

}

public class SingleLevel {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

    }

}
