package Inheritance;

class Car {
    private Engine eng;

    public Car(Engine eng) {
        this.eng = eng;
    }

    public void start() {
        eng.engineStart();
    }

}

class Engine {
    public void engineStart() {
        System.out.println("car started");
    }
}

public class hasA {
    public static void main(String[] args) {

        Engine e = new Engine();

        Car c = new Car(e);
        c.start();

    }

}
